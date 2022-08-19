package onlineClothing.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import onlineClothing.DAO.CategoryDAO;
import onlineClothing.model.Category;

public class CategoryJTest {
	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("onlineClothing");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
	}

	@Test
	public void addCategoryTest() {
		Category category = new Category();
		category.setCategoryName("Shirt");
		category.setCategoryDesc("All variety of TShirt");
		assertTrue("Problem in adding Category", categoryDAO.addCategory(category));
	}
	
}
