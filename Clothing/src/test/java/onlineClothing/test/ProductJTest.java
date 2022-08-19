package onlineClothing.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import onlineClothing.DAO.ProductDAO;
import onlineClothing.model.Product;

public class ProductJTest {
	static ProductDAO productDAO;

	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("onlineClothing");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
		//context.close();
	}
	
	@Test
	public void addProductTest() {
		System.out.println("in product test");
		Product product = new Product();
		product.setProductName("T-Shirt");
		product.setProductDesc("United Colours of Benetton");
		product.setPrice(800);
		product.setStock(45);
		product.setCategoryId(18);
		product.setSupplierId(15);
		assertTrue("Problem in adding Product", productDAO.addProduct(product));
	}

}
