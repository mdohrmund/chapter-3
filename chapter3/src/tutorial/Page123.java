package tutorial;

import java.util.Scanner;

public class Page123 {

	public static void main(String[] args) 
	{
	
		
	double salary1;
	double startingWage;
	Scanner input = new Scanner (System.in);
	
	System.out.print("What is your salary? ");
	salary1 = input.nextDouble();
	System.out.print("What is your starting wage? ");
	startingWage = input.nextDouble();
	

	System.out.println("Demonstrating some raises");
	predictRaise(salary1);

	}
	
	
	public static void predictRaise(double salary)
	{
	double newSalary;
	final double RAISE_RATE = 1.10;
	newSalary = salary * RAISE_RATE;
	System.out.println("Current salary; " + salary + "  After raise: "
			+ newSalary);

		
	}

}
