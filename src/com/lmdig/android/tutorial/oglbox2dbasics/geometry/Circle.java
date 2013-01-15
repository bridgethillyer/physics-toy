package com.lmdig.android.tutorial.oglbox2dbasics.geometry;

public class Circle {
	
	private float radius;
	
	public Circle() {}
	
	public Circle(float r) {
		radius = r;
		onUpdateSize();
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float r) {
		radius = r;
		onUpdateSize();
	}
	
	protected void onUpdateSize() {
		
	}

}
