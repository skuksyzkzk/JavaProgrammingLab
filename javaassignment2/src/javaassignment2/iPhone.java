package javaassignment2;

public class iPhone extends Product {

	private double memory;
	private String color;

	public iPhone(double basePrice, double totalCost, String model, double quantity,
			double memory,String color) {
		super(basePrice, totalCost, model, quantity);
		this.setMemory(memory);
		this.setColor(color);
	}

	public void getUserSelection() {

	}

	public void calculateCost() {
		System.out.println("====== check ======");
		if(this.getModel().equals("iPhone13")) {
			this.setTotalCost(this.getTotalCost()+200);
			System.out.printf("Model (%s) ------ +$%d\n",this.getModel(),200);
		}
		
		
		if(this.getColor().equals("Gold")) {
			this.setTotalCost(this.getTotalCost()+20);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),20);
		}
		else if(this.getColor().equals("Silver")) {
			this.setTotalCost(this.getTotalCost()+10);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),10);
		}
		
		if(this.getMemory()==128) {
			this.setTotalCost(this.getTotalCost()+100);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),100);
		}
		else if(this.getMemory()==256) {
			this.setTotalCost(this.getTotalCost()+200);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),200);
		}
		else if(this.getMemory()==512) {
			this.setTotalCost(this.getTotalCost()+300);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),300);
		}
		
		System.out.printf("Total cost for one iPhone: $%.2f\n",this.getTotalCost());
		System.out.printf("Total cost (quantity x %.0f) : $%.2f\n",this.getQuantity(),
				this.getTotalCost()*this.getQuantity());
		
		
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
