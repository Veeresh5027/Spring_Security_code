package in.vp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/contact")
	public String getContactInfo() {
		
		return "Call : +91 11 22 33 44 55";
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		
		return "Welcome to all";
	}
	
	@GetMapping("/greet")
	public String getMsg() {
		
		return "Good Morning";
	}

}
