package javaassignment2;

import java.util.Scanner;

public class MacBook extends Product {
	/*
	 * two argument constructor 
	 */
	public MacBook(double basePrice, double totalCost) {
		super(basePrice, totalCost);//Initialize base price and total cost
	}
	private int size;//for storing MacBook size
	private int memory;//for storing MacBook memory 
	private String color;//for storing MacBoock color
	
	/*
	 * function for Print MacBook sale menu,
	 * getting the user's selection of features as input using Scanner, 
	 * and using the setter function to set the values of variables.
	 */
	public void getUserSelection() {
		Scanner input = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.printf("Base cost of the MacBook: $%.0f\n",super.getBasePrice());
		System.out.print("Which model do you want (Pro or Air): ");
		super.setModel(input.next());//store user's input model 
		System.out.print("Size (13, 14, 16): ");
		this.setSize(input.nextInt());//store user's input size
		System.out.print("Color (base, Gold, Silver): ");
		this.setColor(input.next());//store user's input color
		System.out.print("Memory (128, 256, 512): ") ;
		this.setMemory(input.nextInt());//store user's input memory
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
			super.setTotalCost(super.getTotalCost()+200);
			System.out.printf("Model (%s) ------ +$%d\n",super.getModel(),200);
		}
		//checking the user's input size,adding and printing extra charge by condition
		if(this.getSize()==14) {
			super.setTotalCost(super.getTotalCost()+100);
			System.out.printf("Size (%d inch) ------ +$%d\n",this.getSize(),100);
		}
		else if(this.getSize()==16) {
			super.setTotalCost(super.getTotalCost()+200);
			System.out.printf("Size (%d inch) ------ +$%d\n",this.getSize(),200);
		}
		//checking the user's input color,adding and printing extra charge by condition
		if(this.getColor().equals("Gold")) {
			super.setTotalCost(super.getTotalCost()+20);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),20);
		}
		else if(this.getColor().equals("Silver")) {
			super.setTotalCost(super.getTotalCost()+10);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),10);
		}
		//checking the user's input memory,adding and printing extra charge by condition
		if(this.getMemory()==256) {
			super.setTotalCost(super.getTotalCost()+100);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),100);
		}
		else if(this.getMemory()==512) {
			super.setTotalCost(super.getTotalCost()+300);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),300);
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
	//function for getting or setting the private field of MacBook
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
