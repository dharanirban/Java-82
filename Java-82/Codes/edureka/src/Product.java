
public class Product {
	int productId;
	String productName;
	float productPrice;
	
	
	Product(int productId, String productName, float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	@Override
	public String toString() {
		return "Product [Product ID= " + productId + " | Product Name= " + productName + " | Product Price=" + productPrice
				+ "]";
	}


	public static void main(String[] args) {
		Product product = new Product(100123, "Mouse", 375f);
		System.out.println(product); //toString();		
	}

}
