package tutorial;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tacoPrice = 1.99;
		double burritoPrice = 2.99;
		double quesadillaPrice = 2.99;
		double ricePrice = .99;
		double beansPrice = .99;
		double chipsPrice = .99;
		double enchPrice = 3.99;
		double drinkPrice = 1.99;
		double nachosPrice = 3.99;
		double tacoSaladPrice = 4.99;
		
		int tacosOrdered;
		int burritosOrdered;
		int quesadillasOrdered;
		int riceOrdered;
		int beansOrdered;
		int chipsOrdered;
		int enchOrdered;
		int drinksOrdered;
		int nachosOrdered;
		int tacoSaladOrdered;
		
		double tacoPriceTotal;
		double burritoPriceTotal;
		double quesadillaPriceTotal;
		double ricePriceTotal;
		double beansPriceTotal;
		double chipsPriceTotal;
		double enchPriceTotal;
		double drinksPriceTotal;
		double nachosPriceTotal;
		double tacoSaladPriceTotal;
		
		double total;
		double tax;
	
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("How many tacos do you want? ");
		tacosOrdered = input.nextInt();
		tacoPriceTotal = tacosOrdered * tacoPrice;
		
		System.out.print("How many burritos do you want? ");
		burritosOrdered = input.nextInt();
		burritoPriceTotal = burritosOrdered * burritoPrice;
		
		System.out.print("How many quesadillas do you want? ");
		quesadillasOrdered = input.nextInt();
		quesadillaPriceTotal = quesadillasOrdered * quesadillaPrice;
		
		System.out.print("How many servings of rice do you want? ");
		riceOrdered = input.nextInt();
		ricePriceTotal = riceOrdered * ricePrice;
		
		System.out.print("How many servings of beans do you want? ");
		beansOrdered = input.nextInt();
		beansPriceTotal = beansOrdered * beansPrice;
		
		System.out.print("How many servings of chips do you want? ");
		chipsOrdered = input.nextInt();
		chipsPriceTotal = chipsOrdered * chipsPrice;
		
		System.out.print("How many enchiladas do you want? ");
		enchOrdered = input.nextInt();
		enchPriceTotal = enchOrdered * enchPrice;
		
		System.out.print("How many drinks do you want? ");
		drinksOrdered = input.nextInt();
		drinksPriceTotal = drinksOrdered * drinkPrice;
		
		System.out.print("How many servings of nachos do you want? ");
		nachosOrdered = input.nextInt();
		nachosPriceTotal = nachosOrdered * nachosPrice;
		
		System.out.print("How many taco salads do you want? ");
		tacoSaladOrdered = input.nextInt();
		tacoSaladPriceTotal = tacoSaladOrdered * tacoSaladPrice;
		
		total = tacoPriceTotal + burritoPriceTotal + quesadillaPriceTotal + ricePriceTotal + beansPriceTotal
				+ chipsPriceTotal + enchPriceTotal + drinksPriceTotal + nachosPriceTotal + tacoSaladPriceTotal;
	    
	    
		
		System.out.print("You ordered " + tacosOrdered + " tacos and it will cost " + tacoPriceTotal 
		        + " dollars. You ordered " + burritosOrdered + " burritos and it will cost " + burritoPriceTotal
		        + " \ndollars. You ordered " + quesadillasOrdered + " quesadillas and it will cost " 
		        + quesadillaPriceTotal + " dollars. You ordered " + riceOrdered + " servings of rice and it will cost "
				+ ricePriceTotal + " \ndollars. You ordered " + beansOrdered + " servings of beans and it will cost "
				+ beansPriceTotal + " dollars. You ordered " + chipsOrdered + " servings of chips and it will cost "
				+ chipsPriceTotal + " dollars. You ordered " + enchOrdered + " enchiladas and it will cost " 
				+ enchPriceTotal + " dollars. You ordered " + drinksOrdered + " drinks and it will cost "
				+ drinksPriceTotal + " dollars. You ordered " + nachosOrdered + " servings of nachos and it will cost " 
				+ nachosPriceTotal + " \ndollars. You ordered " + tacoSaladOrdered + " taco salads and it will cost "
				+ tacoSaladPriceTotal);
				salesTaxCalculation(total);
		
		
	}
	
	public static void salesTaxCalculation(double total)
	{
		
		
		double totalWithTax;
	
		
		totalWithTax = total * 1.075;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(" dollars. With tax your total will be $" + df.format(totalWithTax));
		
		
	}
}
