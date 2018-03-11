package com.beans5.testAOP1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class M implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("代码执行完了.......");
		
	}

}
