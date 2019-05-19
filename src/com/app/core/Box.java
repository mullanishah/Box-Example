package com.app.core;

public class Box {

	private double width, height, depth;
	
	public Box() {
		//default ctor
	}
	
	public Box(double width, double height, double depth){
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	public void display(){
		System.out.println("Box dimensions are " + width + " w, " + height + " h, " + depth + " d");
	}
	
	public double calculate(){
		return (width * height * depth);
	}
}

