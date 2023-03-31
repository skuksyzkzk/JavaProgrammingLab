package javaassignment2;

public class MacBook extends Product {
	private int size;
	private int memory;
	private String color;
	
	public MacBook(double basePrice, double totalCost, String model, double quantity,
			int memory,int size,String color) {
		super(basePrice, totalCost, model, quantity);
		this.setColor(color);
		this.setSize(size);
		this.setMemory(memory);
	}
	
	
	public void getUserSelection() {
		String info = "Model : "+this.getModel()+"\nSize: "+this.getSize()
		+"\nColor: "+this.getColor()+"\nMemory: "+this.getMemory()	;
		System.out.println(info);
		
	}
	public void calculateCost() {
		System.out.println("====== check ======");
		if(this.getModel().equals("Pro")) {
			this.setTotalCost(this.getTotalCost()+200);
			System.out.printf("Model (%s) ------ +$%d\n",this.getModel(),200);
		}
		
		
		if(this.getSize()==14) {
			this.setTotalCost(this.getTotalCost()+100);
			System.out.printf("Size (%d inch) ------ +$%d\n",this.getSize(),100);
		}
		else if(this.getSize()==16) {
			this.setTotalCost(this.getTotalCost()+200);
			System.out.printf("Size (%d inch) ------ +$%d\n",this.getSize(),200);
		}
		
		if(this.getColor().equals("Gold")) {
			this.setTotalCost(this.getTotalCost()+20);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),20);
		}
		else if(this.getColor().equals("Silver")) {
			this.setTotalCost(this.getTotalCost()+10);
			System.out.printf("Color (%s) ------ +$%d\n",this.getColor(),10);
		}
		
		if(this.getMemory()==256) {
			this.setTotalCost(this.getTotalCost()+100);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),100);
		}
		else if(this.getMemory()==512) {
			this.setTotalCost(this.getTotalCost()+300);
			System.out.printf("Meomory (%d) ------ +$%d\n",this.getMemory(),300);
		}
		System.out.printf("Total cost for one MacBook: $%.2f\n",this.getTotalCost());
		System.out.printf("Total cost (quantity x %.0f) : $%.2f\n",this.getQuantity(),
				this.getTotalCost()*this.getQuantity());
		
		
	}
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
