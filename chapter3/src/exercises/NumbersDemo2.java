package exercises;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter an integer >> ");
		num1 = input.nextInt();
		
		System.out.println("Enter another integer >> ");
		num2 = input.nextInt();
		
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2);
		
	}

	public static void displayTwiceTheNumber(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * 2;
		secondNumber = y * 2;
		
		System.out.println("Twice the first number: " + firstNumber);
		System.out.println("Twice the second number : " + secondNumber);
	}
	
	
	public static void displayNumberPlusFive(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x + 5;
		secondNumber = y + 5;
		
		System.out.println("First number plus five: " + firstNumber);
		System.out.println("Second number plus five: " + secondNumber);
	}
	
	
	
	
	public static void displayNumberSquared(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * x;
		secondNumber = y * y;
		
		System.out.println("First number squared: " + firstNumber);
		System.out.println("Second number squared: " + secondNumber);
	}
	
}
