package onlineClothing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import onlineClothing.DAO.CategoryDAO;
import onlineClothing.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	@RequestMapping("/category")
	public String showCategory(Model m) {
		List<Category> listCateg = categoryDAO.listCategories();
		m.addAttribute("listCategories",listCateg );
		
		
		m.addAttribute("pageinfo", "AboutUs");
		return "Category";
	}
	
	@RequestMapping(value="/AddCategory" , method=RequestMethod.POST)
	public String addCategory(Model m,@RequestParam("catgName") String categoryName,@RequestParam("catgDesc") String categoryDesc)
	{
	
		Category category=new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categoryDesc);
		categoryDAO.addCategory(category);
		
		List<Category> listCateg = categoryDAO.listCategories();
		m.addAttribute("listCategories",listCateg);
		
		
		m.addAttribute("pageinfo","Manage Category");
		return "Category";
		
	}
	
	
	
	
	@RequestMapping(value="/UpdateCategory" , method=RequestMethod.POST)
	public String updateCategory(Model m,@RequestParam("catgId")int categoryId,@RequestParam("catgName") String categoryName,@RequestParam("catgDesc") String categoryDesc)
	{
		
		Category category=categoryDAO.getCategory(categoryId);
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categoryDesc);
		categoryDAO.addCategory(category);
		
		List<Category> listCateg = categoryDAO.listCategories();
		m.addAttribute("listCategories",listCateg);
		
		
		m.addAttribute("pageinfo","Manage Category");
		return "Category";
		
	}
	
	
	@RequestMapping(value="/deleteCategory/{categoryId}" )
	public String deleteCategory(Model m, @PathVariable("categoryId")int categoryId)
	{
		Category category=categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);
		
		List<Category> listCateg = categoryDAO.listCategories();
		m.addAttribute("listCategories",listCateg);
		
		m.addAttribute("pageinfo","Manage Category");
		return "Category";	
		
	}
	
	
	@RequestMapping(value="/editCategory/{categoryId}" )
	public String editCategory(Model m, @PathVariable("categoryId")int categoryId)
	{
		Category category=categoryDAO.getCategory(categoryId);
		
		m.addAttribute("category",category);
		
		m.addAttribute("pageinfo","Manage Category");
		return "UpdateCategory";
		
	}


	

}
