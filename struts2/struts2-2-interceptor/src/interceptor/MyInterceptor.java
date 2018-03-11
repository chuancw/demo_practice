package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("Ç°");
		  String value=  arg0.invoke();
		  System.out.println("ºó");
		  System.out.println(value);
		  return value;
	
	    
	}
	
	    
        
}
