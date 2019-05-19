package com.app.core;

public class Tester {

	public static void main(String[] args) {
		Box b1;
		//System.out.println(b1); //Compilation error- not initailized
		b1 = new Box();
		//System.out.println(b1);  //Object's hashcode
		b1 = new Box(10, 5, 3);
		b1.display();
		System.out.println("Volume of the box : " + b1.calculate());
	}

}
