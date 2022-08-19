package onlineClothing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/home")
	public String showHome(Model m) {
		m.addAttribute("pageinfo", "Home");
		return "Home";
	}

	@RequestMapping("/login")
	public String showLogin(Model m) {
		m.addAttribute("pageinfo", "Login");
		return "Login";
	}

	@RequestMapping("/register")
	public String showRegister(Model m) {
		m.addAttribute("pageinfo", "Register");
		return "Register";
	}

	@RequestMapping("/contactus")
	public String showContectUs(Model m) {
		m.addAttribute("pageinfo", "ContactUs");
		return "ContactUs";
	}

	@RequestMapping("/aboutus")
	public String showAboutUs(Model m) {
		m.addAttribute("pageinfo", "AboutUs");
		return "AboutUs";
	}

}
