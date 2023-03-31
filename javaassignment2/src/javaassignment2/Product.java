package javaassignment2;

public class Product {
	private double basePrice;
	private double totalCost;
	private String model;
	private double quantity;

	public Product(double basePrice, double totalCost, String model, double quantity) {
		this.setBasePrice(basePrice);
		this.setTotalCost(totalCost);
		this.setModel(model);
		this.setQuantity(quantity);
	}

	public void getUserSelection() {	
		
	}

	public void calculateCost() {
		
	}

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
