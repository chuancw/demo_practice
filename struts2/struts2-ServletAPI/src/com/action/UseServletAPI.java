package com.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class UseServletAPI {
         public String use(){
        	 //0:获取ActionContext对象
        	 ActionContext actionContext=ActionContext.getContext(); //静态工厂方法
        	 //1:获取application对应的map
        	 Map<String,Object> applicationMap=actionContext.getApplication();
        	 //设置属性
        	 applicationMap.put("applicationKey", "applicationValue");
        	 //获取属性
        	 Object date=applicationMap.get("date");
        	 System.out.println("date:"+date);
        	 //2:获取session对应的map
        	 Map<String,Object> sessionMap=actionContext.getSession();
        	 sessionMap.put("sessionKey","sessionValue");
        	 //3:获取request对应的map
        	 Map<String,Object> requestMap=(Map<String, Object>) actionContext.get("request");
        	 requestMap.put("requestKey", "requestValue");
        	 //4:获取请求参数map
        	 //  只能读不能写入
        	 Map<String,Object> parameters=actionContext.getParameters();
        	 String name=((String[])parameters.get("name"))[0];//返回的是一个数组
        	 System.out.println("name:"+name);
        	 return "success";
         }
}
