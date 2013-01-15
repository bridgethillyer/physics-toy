package com.lmdig.android.tutorial.oglbox2dbasics.geometry;

import static android.opengl.GLES10.GL_TRIANGLE_FAN;
import static android.opengl.GLES10.glDrawArrays;
import static android.opengl.GLES10.glPopMatrix;
import static android.opengl.GLES10.glPushMatrix;
import static android.opengl.GLES10.glRotatef;
import static android.opengl.GLES10.glTranslatef;

import java.nio.FloatBuffer;

import java.lang.Math;

import com.lmdig.android.tutorial.oglbox2dbasics.tools.BufferTool;
import com.lmdig.android.tutorial.oglbox2dbasics.tools.GLBufferTool;

public class GLCircle extends Circle {
	
	public static int NUM_VERTICES = 360;
	
	FloatBuffer fbVertices;
	
	public GLCircle() {
		super();
	}
	
	public GLCircle(float r) {
		super(r);
	}
	
	public void draw() {
		GLBufferTool.setGLVertexBuffer(2, fbVertices); 
		glDrawArrays(GL_TRIANGLE_FAN, 
				0, 
				NUM_VERTICES);

	}
	public void draw(float x, float y, float angle) {
		glPushMatrix();
		
		glTranslatef(x, y, 0);
		glRotatef((float)Math.toDegrees(angle), 0, 0, 1);
		GLBufferTool.setGLVertexBuffer(2, fbVertices); 
		glDrawArrays(GL_TRIANGLE_FAN, 
				0, 
				NUM_VERTICES);
		
		glPopMatrix();

	}
	
	@Override
	protected void onUpdateSize() {
		double angle;
		float[] v = new float[NUM_VERTICES * 2];
	    for(int i = 0; i < NUM_VERTICES; i++) { 
	        angle = i*2*Math.PI/100; 
	        v[i*2] = (float)(Math.cos(angle) * getRadius());
	        v[i*2+1] = (float)(Math.sin(angle) * getRadius()); 
	    } 
	    
		fbVertices = BufferTool.makeFloatBuffer(v);
	}

}
