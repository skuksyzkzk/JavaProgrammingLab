package javaassignment2;

import java.util.Scanner;

public class Main {
	static void printAsk() {
		System.out.print("Do yo u want to purchase something else (Yes: 1, No: 0");
	}
	static boolean askMorePurchase(int choice) {
		if(choice==1) return true;

		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String menu = "==== Welcome Apple Korea ====\n"+
		"What do you want to buy?\n"+"Choose 1 for MacBook\n"+
				"Choose 2 for iPhone\n"+"Choose 3 for AirPods\n"+
				"Choose 0 for Exit\n"+"Please enter your choice: ";
		int choice = 5;
		String model,color;
		double quantity;
		int size,memory;
		while(choice!=0) {
			System.out.println(menu);
			choice = input.nextInt();
			if(choice ==1) {
				System.out.print("Base cost of the MacBook: $1000\n");
				System.out.println("Which model do you want (Pro or Air): ");
				model = input.next();
				System.out.println("Size (13, 14, 16): ");
				size = input.nextInt();
				System.out.println("Color (base, Gold, Silver: ");
				color = input.next();
				System.out.println("Memory (128, 256, 512): ") ;
				memory = input.nextInt();
				System.out.println("How many do you want to buy: ");
				quantity = input.nextDouble();
				MacBook mac = new MacBook(1000,1000,model,quantity,memory,size,color);
				mac.calculateCost();
				printAsk();
				choice= input.nextInt();
				if(askMorePurchase(choice)) continue;
				else break;
				
			}
			else if(choice ==2) {
				System.out.print("Base cost of the iPhone: $800\n");
				System.out.println("Which model do you want (iPhone12 or iPhone13): ");
				model = input.next();
				System.out.println("Color (base, Gold, Silver: ");
				color = input.next();
				System.out.println("Memory (64, 128, 256, 512): ") ;
				memory = input.nextInt();
				System.out.println("How many do you want to buy: ");
				quantity = input.nextDouble();
				iPhone iphone = new iPhone(800,800,model,quantity,memory,color);
				iphone.calculateCost();
				printAsk();
				choice= input.nextInt();
				if(askMorePurchase(choice)) continue;
				else break;
			}
			else if(choice ==3) {
				System.out.print("Base cost of the AirPods: $800\n");
				System.out.println("Which model do you want (3 or Pro or Max): ");
				model = input.next();
				System.out.println("How many do you want to buy: ");
				quantity = input.nextDouble();
				AirPods airpods = new AirPods(120,120,model,quantity);
				airpods.calculateCost();
				printAsk();
				choice= input.nextInt();
				if(askMorePurchase(choice)) continue;
				else break;
			}
		}
		System.out.println("Thank you for your purchase");
	}	

}
