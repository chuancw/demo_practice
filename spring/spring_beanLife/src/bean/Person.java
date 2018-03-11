package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{
      private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("set method execute......");
	}
     public Person(){
    	   System.out.println("Person constructor.......");
     }
     public void go(){
    	  System.out.println("go()  execute......");
     }

	@Override
	public void setBeanName(String arg0) {
		  System.out.println("得到设置的id的BeanName: "+arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		  System.out.println("得到BeanFactory对象："+arg0);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		 System.out.println("得到ApplicationContext对象："+arg0);
		
	}
     //在后置处理器before 和after之间执行的方法。
	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("afterPropertiesSet()....");
	}
	public void init(){
		 System.out.println("执行定制方法.....");
	}
}
