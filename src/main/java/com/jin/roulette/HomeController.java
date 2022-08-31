package com.jin.roulette;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {

		req.setAttribute("cp", "cp.jsp");
		req.setAttribute("cp2", "cp2.jsp");
		return "index";
	}
	
}
