package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b")
public class BModel {
      @RequestMapping("/login")
      public String Login(){
    	   System.out.println("BModel");
    	   return "index.jsp";
      }
}
