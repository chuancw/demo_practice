package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

 @Controller

public class Login {
	   @RequestMapping("/login")
       public String login(String username,String password,Model model){
    	   if(username.equals("a")&&password.equals("123")){
    		   model.addAttribute("info", username);
    		   System.out.println("÷¥––¡À");
    		   return "ok.jsp";
    		   
    	   }
    	   else{
    		   System.out.println("÷¥––");
    		   return "no.jsp";
    	   }
       }
}
