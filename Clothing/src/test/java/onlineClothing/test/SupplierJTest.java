package onlineClothing.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import onlineClothing.DAO.SupplierDAO;
import onlineClothing.model.Supplier;

public class SupplierJTest {
	static SupplierDAO supplierDAO;

	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("onlineClothing");
		context.refresh();
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		//context.close();
	}
	
	@Test
	public void addSupplierTest() {
		Supplier supplier = new Supplier();
		supplier.setSupplierId(5);
		supplier.setSupplierName("deep");
		supplier.setSupplierAddr("Delhi");
		assertTrue("Problem in adding Supplier", supplierDAO.addSupplier(supplier));
	}
}
