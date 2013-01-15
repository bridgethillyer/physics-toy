package com.lmdig.android.tutorial.oglbox2dbasics.geometry;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.BodyDef;

import com.kristianlm.robotanks.box2dbridge.IBody;
import com.kristianlm.robotanks.box2dbridge.IShape;
import com.kristianlm.robotanks.box2dbridge.IWorld;

public class GameShapeCircle extends GameShape {

	GLCircle circle;
	IBody body;
	IShape shape;
	Vec2 shapePosition;
	
	public GameShapeCircle(GLCircle c) {
		circle = c;
	}
	
	@Override
	public void draw() {
		Vec2 p = body.getWorldCenter().add(shapePosition);
		
		circle.draw(p.x, p.y, body.getAngle());
	}

	@Override
	public IShape attachToBody(IBody body, Vec2 position, float density) {
		if(this.shape != null) {
			throw new RuntimeException("Shape already attached");
		}
		
		if(position == null)
			position = new Vec2(0, 0);
		
		shapePosition = position;
		
		this.body = body;
		shape = body.createBox(
					circle.getRadius(), 
					circle.getRadius(), 
					position.x, 
					position.y, 
					density, 
					0
				);
		

		body.setMassFromShapes();
		return shape;
	}

	/**
	 * This can probably be in base class
	 */
	@Override
	public IBody attachToNewBody(IWorld world, Vec2 position, float density) {
		BodyDef def = new BodyDef();
		def.angularDamping = 0.5f;
		def.linearDamping = 0.5f;
		def.allowSleep = false;
		body = world.createBody(def);
		
		attachToBody(body, position, density);
		
		body.refilter(0xFFFF, 0xFFFF, 0);

		return body;
	}

	/**
	 * This can probably be in base class
	 */
	@Override
	public void detachFromBody(IBody body) {
		body.destroyShape(shape);
		shape = null;
		body = null;
	}

	/**
	 * This can probably be in base class
	 */
	@Override
	public void detachBody(IWorld world) {
		world.destroyBody(body);
		body = null;
	}

}
