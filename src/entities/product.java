package entities;

public class product {
	
	private String  name;
	private double  price;
	private int  quantity;
	
	public double totalValueStock() {
		
		return price * quantity;
	}
	public void addProducts(int quantity ) {
		
		this.quantity += quantity;
		
	}
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}
	public String toString() {
		
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f",totalValueStock());
	}

}
