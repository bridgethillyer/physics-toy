package com.lmdig.android.tutorial.oglbox2dbasics.geometry;

import org.jbox2d.common.Vec2;

import com.kristianlm.robotanks.box2dbridge.IBody;
import com.kristianlm.robotanks.box2dbridge.IShape;

public class GameShapeCircle extends GameShape {

	GLCircle circle;
	
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


}
