package e.commerce.model;

public class Cart extends Product {

	private int quantity;
	
	public Cart() {
		
	}

	public Cart(int quantity) {
		
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
