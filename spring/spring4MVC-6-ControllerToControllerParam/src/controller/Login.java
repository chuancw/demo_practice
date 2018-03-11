package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
     @RequestMapping("/login")
     public String listUsername(String username){
    	 System.out.println("username="+username);
    	 return "redirect:/listUsername.spring?username="+username;
     }
}
