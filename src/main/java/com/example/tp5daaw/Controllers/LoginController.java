package com.example.tp5daaw.Controllers;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import com.example.tp5daaw.Model.User;
import com.example.tp5daaw.Model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {



	@PostMapping("/login")
	public String addUser(HttpServletRequest request, @RequestParam String username, @RequestParam String password)
			throws InstantiationException, IllegalAccessException {

		String page = "login";
		
		if (request.getSession(false).getAttribute("user") == null) {
//			
			System.out.print("1");
			UserDAO myDAO = new UserDAO();
			User user = myDAO.checkLogin(username, password);

			if (user != null) {
				System.out.print("2");
				HttpSession mySession = request.getSession();
				mySession.setAttribute("user", user);
				page = "home";

			}else {
				
			}
		}
		System.out.print("3");
		return page;

	}

	@GetMapping("/logout")
	public String getUser(HttpServletRequest request) throws InstantiationException, IllegalAccessException {

		HttpSession mySession = request.getSession(false);
		mySession.removeAttribute("user");
		mySession.invalidate();

		return ("login");

	}
}
