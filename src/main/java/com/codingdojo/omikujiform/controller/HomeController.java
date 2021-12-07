package com.codingdojo.omikujiform.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String city = (String) session.getAttribute("city");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String thing = (String) session.getAttribute("thing");
		String message = (String) session.getAttribute("message");
		Integer number = (Integer) session.getAttribute("number");
		
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("thing", thing);
		model.addAttribute("message", message);
		model.addAttribute("hobby", hobby);
		
			
		return "show.jsp";
	}
	
	@PostMapping("/process")
	public String process(
			@RequestParam("number") Integer number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("thing") String thing,
			@RequestParam("message") String message, 
			HttpSession session
			) {
			
		session.setAttribute("message", message);
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		
		return "redirect:/omikuji/show";
		
		
		
	}
	
	
}
