package action;

import java.util.List;

import org.hibernate.Session;

import orm.Main13;
import orm.Main13DAO;

import com.opensymphony.xwork2.ActionSupport;

public class ShowInfo extends ActionSupport{
     public String execute(){
    	 Main13DAO dao =new Main13DAO();
    	 Session session=dao.getSession();
    	 session.beginTransaction();
    	 
    	 List<Main13> list=session.createQuery(
    			 "from Main13 as m Where m.id=5" ).list();  //HQLÓï¾ä
    	 System.out.println(list.get(0).getId()+" "+list.get(0).getUsername());
    	 session.close();
    	 
    	 
    	 
    	 
    	 
    	 
    	 return SUCCESS;
}
}
