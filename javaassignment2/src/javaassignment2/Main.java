package javaassignment2;

import java.util.Scanner;

public class Main {
	/*
	 * function for asking additional purchase check the user's choice and return
	 * thats choice boolean
	 */
	static boolean askAdditionalPurchase() {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to purchase something else (Yes: 1, No: 0): ");
		int choice = input.nextInt();// for storing user's choice
		// if user's choice is 1,return true
		if (choice == 1){
			return true;
		}
		//if user's choice is 0,return false
		else if (choice == 0) {
			
			return false;
		}
		//if user's choice is not 0 or 1,Print error message
		System.err.println("Wrong choice input,Please enter 0 or 1");
		//return this method again,so User must input O or 1 again. 
		return askAdditionalPurchase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//for storing the main choice menu 
		String menu = "==== Welcome Apple Korea ====\n" + "What do you want to buy?\n" + "Choose 1 for MacBook\n"
				+ "Choose 2 for iPhone\n" + "Choose 3 for AirPods\n" + "Choose 0 for Exit\n"
				+ "Please enter your choice: ";
		int choice = 5;//for storing the user's choice
		/*
		 * Iterating for printing menu and getting the user's choice
		 * then depending on choice,execute each function
		 * if choice is 0,break the loop
		 */
		while (choice != 0) {
			System.out.print(menu);
			choice = input.nextInt();
			//if choice is 1,execute MacBook sale system 
			if (choice == 1) {
				MacBook mac = new MacBook(1000, 1000);//initialize base price and total cost
				mac.getUserSelection();
				mac.calculateCost();
				mac.printFinalBill();
				//if user's choice is continuing purchase,continue loop 
				if (askAdditionalPurchase())
					continue;
				//if user's choice is not continuing purchase,break loop
				else
					break;
			} 
			//if choice is 2,execute iPhone sale system
			else if (choice == 2) {
				iPhone iphone = new iPhone(800, 800);//initialize base price and total cost 
				iphone.getUserSelection();
				iphone.calculateCost();
				iphone.printFinalBill();
				//if user's choice is continuing purchase,continue loop 
				if (askAdditionalPurchase())
					continue;
				//if user's choice is not continuing purchase,break loop
				else
					break;
			}
			//if choice is 2,execute AirPods sale system
			else if (choice == 3) {
				AirPods airpods = new AirPods(120, 120);//initialize base price and total cost
				airpods.getUserSelection();
				airpods.calculateCost();
				airpods.printFinalBill();
				//if user's choice is continuing purchase,continue loop 
				if (askAdditionalPurchase())
					continue;
				//if user's choice is not continuing purchase,break loop
				else
					break;
			}
		}
		System.out.println("Thank you for your purchase");
		input.close();
	}

}
