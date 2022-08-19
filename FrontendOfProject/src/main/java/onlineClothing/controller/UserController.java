package onlineClothing.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import onlineClothing.DAO.ProductDAO;
import onlineClothing.model.Product;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Controller
public class UserController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value="/userhome")
	public String showUserHome(Model m,HttpSession session) {
		m.addAttribute("pageinfo","Product Catalog");
		List<Product> listProducts = productDAO.listProducts();
		m.addAttribute("productList",listProducts);
		return "UserHome";
	}
	
	@RequestMapping(value=",login_success")
	public String loginCheck(Model m,HttpSession session) {
		String page="";
		boolean loggedIn=false;
		SecurityContext securitycontext=SecurityContextHolder.getContext();
		Authentication authentication = securitycontext.getAuthentication();
		String username=authentication.getName();
		Collection<GrantedAuthority> roles=(Collection<GrantedAuthority>)authentication.getAuthorities();
		for(GrantedAuthority role:roles) {
			session.setAttribute("role",role.getAuthority());
			if(role.getAuthority().equals("Role_ADMIN")) {
				loggedIn=true;
				page="AdminHome";
				session.setAttribute("loggedIn", loggedIn);
				session.setAttribute("username", username);
			}
			else {
				m.addAttribute("pageinfo","User_Home");
				List<Product> listProducts=productDAO.listProducts();
				m.addAttribute("productList",listProducts);
				loggedIn=true;
				page="UserHome";
				
				session.setAttribute("loggedIn", loggedIn);
				session.setAttribute("username", username);
			}
		}
		return page;
	}

}