package com.api.html.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.html.entity.Login;

@Controller
//@CrossOrigin(origins="http://localhost:8090/login")
public class LoginController {
	
	    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login.html";
	    }
	    
//	    @PostMapping("/login")
//	    public String login(@RequestBody Login login) {
//	    	String login_id = login.getLogin_id();
//	    	String password = login.getPassword();
//	    	
//	    	if("test@sunbasedata.com".equals(login_id) && "Test@123".equals(password)) {
//	    		return "customer_list.html";
//	    	}
//	    	return "login.html";
//	    }
	    
	

}



