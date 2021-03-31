package io.assignment.question2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomPage {
	
	@GetMapping("/")
	public String homePage() {
		return ("<h1>Welcome to Home Page.</h1>");
	}
	
	@GetMapping("/user")
	public String userPage() {
		return ("<h1>Welcom User to the Home Page.</h1>");
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return("<h1>Welcom Admin to the Home Page.</h1>");
	}
}
