package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IfUserLogin extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ac=invocation.getInvocationContext();//获得请求的ActionContext实例
		Map  session=ac.getSession();
		String username=(String) session.get("username");
		if(username!=null){
			System.out.println("拦截通过");
			return invocation.invoke();   //表示继续执行
		}
		else{
			System.out.println("登录拦截！");
			ac.put("tip","请先登录！");
			
            return Action.LOGIN;			
		}
	    
	}
                            
}
