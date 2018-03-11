package com.reUsers;

public class LoginDeal {
      public boolean check(Login login){
    	  if(login.getUsername().equals("abc")&&(login.getPassword().equals("123"))){
    		  
    		  
    		  return true;
    		  
    	  }
    	  else{
    		  return false;
    	  }
      }
}
