package controller;

public class PrintUsername {
	   private String username;
	   public String getUsername(){
		   return username;
		   
	   }
	   public void setUsername(String username){
		   this.username=username;
	   }
       public String execute(){
    	     System.out.println("PrintUsername's execute()  username="+username);
    	     return "OK";
       }
}
