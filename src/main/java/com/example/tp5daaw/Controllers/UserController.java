package com.example.tp5daaw.Controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.example.tp5daaw.Model.User;
import com.example.tp5daaw.Model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

	@GetMapping("/addUserForm")
	public String addUserForm(HttpServletRequest request){
		
		if (request.getSession().getAttribute("user") != null) 

			return ("addUserForm");
		else
			return ("login");

	}
	
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("myuser") User myuser) throws InstantiationException, IllegalAccessException{
			
		UserDAO myDAO = new UserDAO();
		myDAO.addUser(myuser);
		
		return "addUserForm";

		
	}

	@RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
	public String updateUser(@ModelAttribute("myuser") User myuser) throws InstantiationException, IllegalAccessException{
		UserDAO myDAO = new UserDAO();
		myDAO.updateUser(myuser, myuser.getid());
		return "update";


	}
	@RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteUser(@ModelAttribute("myuser") User myuser) throws InstantiationException, IllegalAccessException{
		UserDAO myDAO = new UserDAO();
		myDAO.deleteUser(myuser.getUsername(), myuser.getPassword());
		return "delete";

	}






	@GetMapping("/usersList")
	public String usersList(HttpServletRequest request,Model model) throws InstantiationException, IllegalAccessException{
		
		UserDAO myDAO;
		if (request.getSession().getAttribute("user") != null) {
			
			myDAO = new UserDAO();
			ArrayList<User> list = new ArrayList<User>();
			list = myDAO.getUsers();
			model.addAttribute("list", list);
			return ("usersList");
		}else
			return ("login");

	}
	

}