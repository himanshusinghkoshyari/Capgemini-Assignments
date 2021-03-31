package io.assignment.question3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String homePage() {
		return ("<h1>Welcome to Home Page.</h1>");
	}
	
	@GetMapping("/user")
	public String userHomePage() {
		return ("<h1>Welcome USER to Home Page.</h1>");
	}
	
	@GetMapping("/admin")
	public String adminHomePage() {
		return ("<h1>Welcome ADMIN to Home Page.</h1>");
	}
	
}