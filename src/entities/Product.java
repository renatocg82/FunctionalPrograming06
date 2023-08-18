package entities;

public class Product {

	private String name;
	private Double price;

	public Product() {

	}

	public Product(String name, Double price) {

		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p1) {
		return p1.getPrice() >= 100.0;
	}

	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100.0;
	}
	
	public static String staticFunctionNames(Product p) {
		return p.getName().toUpperCase(); 
	}
	
	public String nonStaticFunctionNames() {
		return this.getName().toUpperCase();
	}
	

	@Override
	public String toString() {

		return "[name=" + this.name + ", price=" + String.format("%.2f", this.price) + "]";

	}

}