package com.api.html.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@CrossOrigin(origins="http://localhost:8090/login")
public class CustomerController {
	
	@GetMapping(path="/customerList", consumes= {MediaType.ALL_VALUE})
    public String showCustomerListPage() {
        return "customer_list.html";
   }

}
