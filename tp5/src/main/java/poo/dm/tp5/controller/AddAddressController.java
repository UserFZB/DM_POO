package poo.dm.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddAddressController {
	
	@GetMapping ("/addAddress")
	 public String test(Model model) {
		 return "addAddress";
	 }

}
