package entites;

public class Produto {

	public String name;
	public double price;
	public int quantity;
	
	public Produto() {
	}
	
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;		
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
