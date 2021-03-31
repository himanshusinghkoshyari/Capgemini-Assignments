package io.assignment.question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
}
