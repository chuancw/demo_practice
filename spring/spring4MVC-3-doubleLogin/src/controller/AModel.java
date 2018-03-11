package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
   public class AModel {
         @RequestMapping("/login")
         public String login(){
        	 System.out.println("AModel");
        	 return "index.jsp";
         }
}
