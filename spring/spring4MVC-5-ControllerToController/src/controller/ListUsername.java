package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListUsername {
       @RequestMapping("/listUsername")
       public String listUsername(Model model){
    	   List l=new ArrayList();
    	   for(int i=0;i<10;i++){
    		   l.add("username"+(i+1));
    	   }
    	   model.addAttribute("info", l);
    	   return "listUsername.jsp";
       }
}
