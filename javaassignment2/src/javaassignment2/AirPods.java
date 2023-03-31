package javaassignment2;

public class AirPods extends Product {

	public AirPods(double basePrice, double totalCost, String model, double quantity) {
		super(basePrice, totalCost, model, quantity);
	}

	public void getUserSelection() {

	}

	public void calculateCost() {
		System.out.println("====== check ======");
		if(this.getModel().equals("Pro")) {
			this.setTotalCost(this.getTotalCost()+100);
			System.out.printf("Model (%s) ------ +$%d\n",this.getModel(),100);
		}
		else if(this.getModel().equals("Max")) {
			this.setTotalCost(this.getTotalCost()+200);
			System.out.printf("Model (%s) ------ +$%d\n",this.getModel(),200);
		}
		System.out.printf("Total cost for one AirPod: $%.2f\n",this.getTotalCost());
		System.out.printf("Total cost (quantity x %.0f) : $%.2f\n",this.getQuantity(),
				this.getTotalCost()*this.getQuantity());
	}

}
