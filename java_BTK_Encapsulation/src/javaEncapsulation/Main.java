package javaEncapsulation;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		ProductManager manager=new ProductManager();
		product.setName("laptop");
		product.setId("2556");
		product.setPrice(500);
		product.setStockAmount(3);
		product.setDescription("asus laptop");
		manager.add(product);

	}

}
