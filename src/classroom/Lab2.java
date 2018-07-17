package classroom;

import java.util.Scanner;

public class Lab2 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Enter value of length in feet.");
			double length = scnr.nextDouble();
			
			System.out.println("Enter value of width in feet.");
			double width = scnr.nextDouble();
			
			System.out.println("Enter vaue of height");
			double height = scnr.nextDouble(); 
			
			double Perimeter = width + width + length + length;
			double Area = width * length; 
			double Volume = length * width * height;
					
			System.out.println("Perimeter of classroom is " + Perimeter + " feet.");
			System.out.println("Area of the classroom is " + Area + " feet squared.");
			System.out.println("Volume of the classroom is " + Volume + " feet cubed");
			
			scnr.close();
			
			System.out.println("Would you like to continue? (Yes/No)");
	 //making change because David told me to 
	
		}
	
}
