package onlineClothing.DBConfig;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import onlineClothing.model.CartItem;
import onlineClothing.model.Category;
import onlineClothing.model.OrderDetail;
import onlineClothing.model.Product;
import onlineClothing.model.Supplier;
import onlineClothing.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("onlineClothing")
public class DBConfig {
	
	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		System.out.println("dasource object is created");
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/onlineshopping");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		
		
		return dataSource;
	}
	
	

	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory() {
		Properties hibernateProp = new Properties();
		//hibernateProp.put("hibernate.hbm2ddl.auto", "update");
	//	hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		hibernateProp.put("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect ");
		//spring.jpa.properties
				 //org.hibernate.dialect.MySQLInnoDBDialect"

		LocalSessionFactoryBuilder localFactory = new LocalSessionFactoryBuilder(getH2DataSource());
		localFactory.addProperties(hibernateProp);

		localFactory.addAnnotatedClass(Category.class);
		localFactory.addAnnotatedClass(Product.class);
		localFactory.addAnnotatedClass(Supplier.class);
		localFactory.addAnnotatedClass(UserDetail.class);
		localFactory.addAnnotatedClass(CartItem.class);
		localFactory.addAnnotatedClass(OrderDetail.class);
//		

		System.out.println("SessionFactory Object is Created");
		return localFactory.buildSessionFactory();
	}

	@Bean(name = "txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("Transaction Manager Object Created");
		return new HibernateTransactionManager(sessionFactory);
	}

}
