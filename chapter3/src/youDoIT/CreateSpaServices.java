package youDoIT;

import java.util.Scanner;

public class CreateSpaServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateSpaServices firstService = new CreateSpaServices();
		CreateSpaServices secondService = new CreateSpaServices();
		firstService = getData(firstService);
		secondService = getData(secondService);
		System.out.println("First service details");
		System.out.println(firstService.getServiceDescription() + " $"
				+ firstService.getPrice());
		System.out.println("Second service details");
		System.out.println(secondService.getServiceDescription() + " $"
				+ secondService.getPrice());
		
	
	}
	
	private String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getServiceDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public static CreateSpaServices getData(CreateSpaServices s)
	
	{
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		keyboard.nextLine();
		s.setServiceDescription(service);
		s.setPrice(price);
		
		return s;
	}

}
