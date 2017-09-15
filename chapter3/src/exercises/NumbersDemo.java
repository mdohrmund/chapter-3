package exercises;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 10;	
		
		
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
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	
	
	public static void displayNumberPlusFive(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x + 5;
		secondNumber = y + 5;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	
	
	
	
	public static void displayNumberSquared(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * x;
		secondNumber = y * y;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	
	}
	
	
	
