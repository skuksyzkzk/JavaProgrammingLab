package javaassignment2;

import java.util.Scanner;

public class AirPods extends Product {

	/*
	 * two argument constructor 
	 */
	public AirPods(double basePrice, double totalCost) {
		super(basePrice, totalCost);//Initialize base price and total cost
	}
	/*
	 * function for Print AirPods sale menu,
	 * getting the user's selection of features as input using Scanner, 
	 * and using the setter function to set the values of variables.
	 */
	public void getUserSelection() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.printf("Base cost of the AirPods: $%.0f\n",super.getBasePrice());
		System.out.print("Which model do you want (3 or Pro or Max): ");
		super.setModel(input.next());//store user's input model
		System.out.print("How many do you want to buy: ");
		super.setQuantity(input.nextDouble());//store user's input quantity
	}
	/*
	 * function for calculating cost depending on user's input value by condition
	 * and printing extra charge 
	 * using a getter to get the value of variables set on the getUserSelection() method. 
	 */
	public void calculateCost() {
		System.out.println("====== check ======");
		//checking the user's input model,adding and printing extra charge by condition
		if(super.getModel().equals("Pro")) {
			super.setTotalCost(super.getTotalCost()+100);
			System.out.printf("Model (%s) ------ +$%d\n",super.getModel(),100);
		}
		else if(super.getModel().equals("Max")) {
			super.setTotalCost(super.getTotalCost()+200);
			System.out.printf("Model (%s) ------ +$%d\n",super.getModel(),200);
		}
		
	}
	/*
	 * function for printing final payment
	 * total cost for one thing and by quantity 
	 * using a getter to get the value of variables set on the getUserSelection() method.
	 */
	public void printFinalBill() {
		System.out.println();
		System.out.printf("Total cost for one MacBook: $%.2f\n",super.getTotalCost());
		System.out.printf("Total cost (quantity x %.0f) : $%.2f\n",super.getQuantity(),
				super.getTotalCost()*super.getQuantity());
	}

}
