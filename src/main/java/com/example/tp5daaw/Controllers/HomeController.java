package com.example.tp5daaw.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	@GetMapping("/")
	public String home(HttpServletRequest request){
		if (request.getSession().getAttribute("user") != null) 
			return ("home");
		else
			return ("login");
		

	}
}
