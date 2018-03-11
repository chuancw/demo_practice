package service;

public class UserinfoService  {
      public boolean login(String username,String password){
    	      if("abc".equals(username)&&"123456".equals(password)){
    	    	   return true;
    	      }
    	      return false;
      }
}
