package com.app.core;

import java.util.Scanner;

/*
 * Array Of Boxes
*/
public class Tester2 {
	
	public static void main(String[] args) {
		Box[] boxes;
		Scanner sc = null;
		try{
			sc = new Scanner(System.in);
			System.out.println("Enter number of boxes :");
			/*int boxCount = sc.nextInt();
			boxes = new Box[boxCount];*/
			boxes = new Box[sc.nextInt()];
			
			/*for(Box box : boxes){
				System.out.println(box); //null-as box uninitialized
			}*/
			for(int i = 0; i < boxes.length; i++){
				System.out.println("Enter dimensions(w,h,d) :");
				boxes[i] = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			}
			System.out.println("Boxes measurements");
			for(Box b : boxes){
				b.display();
			}
			System.out.println("Calculating volume");
			int i = 0;
			for(Box b : boxes){
				System.out.println("Volume " + ++i + ": " + b.calculate()); 
			}
		}finally{
			sc.close();
		}
	}

}
