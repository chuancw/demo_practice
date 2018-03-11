package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="login")
public class Login {
     @RequestMapping(method=RequestMethod.GET)
     public String get(){
    	 System.out.println("get提交");
         return "index.jsp";
     }
     
     @RequestMapping(method=RequestMethod.POST)
     public String post(){
    	 System.out.println("post提交");
    	 return "index.jsp";
     }
}
