package com.beans5.testAOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Tell implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		    System.out.println("准备打印了。。。。。。");
	}

}
