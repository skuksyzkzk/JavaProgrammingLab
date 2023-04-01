package javaassignment2;

public class Product {
	private double basePrice;//for storing product's base price 
	private double totalCost;//for storing product's total cost 
	private String model;//for storing product's model
	private double quantity;//for storing product's quantity 
	

	/*
	 * two argument constructor
	 */
	public Product(double basePrice, double totalCost) {
		this.setBasePrice(basePrice);//Initialize base price 
		this.setTotalCost(totalCost);//Initialize total cost
		this.setModel("null");//Initialize Model to 'null'
		this.setQuantity(0);//Initialize quantity to 0
	}
	/*
	 * I don't implement this function because each mac,iphone,airpods condition is different 
	 * function for Print product sale menu,
	 * getting the user's selection of features as input using Scanner, 
	 * and using the setter function to set the values of variables.
	 */
	public void getUserSelection() {	
		System.out.println("Get Product info");
	}
	/* I don't implement this function because each mac,iphone,airpods condition is different
	 * function for calculating cost depending on user's input value by condition
	 * and printing extra charge 
	 * using a getter to get the value of variables set on the getUserSelection() method. 
	 */
	public void calculateCost() {
		System.out.println("Calculate Cost");
	}
	//function for getting or setting the private field of MacBook
	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
