package onlineClothing.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import onlineClothing.DAO.UserDAO;
import onlineClothing.model.UserDetail;

public class UserJTest {
	static UserDAO userDAO;

	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("onlineClothing");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		//context.close();
	}
	
	@Test
	public void registerUserTest() {
		UserDetail user = new UserDetail();
		user.setUserName("tulsi2");
		user.setPassword("password");
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		user.setCustomerName("tulsi");
		user.setCustomerAddr("Mumbai");
		assertTrue("Problem in Registering User",userDAO.registerUser(user));
	}

}
