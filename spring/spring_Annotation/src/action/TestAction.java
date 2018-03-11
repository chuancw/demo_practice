package action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
@Controller
public class TestAction {
         private String name;
         @Resource
         private TestService test;
         
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
        public void go(){
        	 System.out.println("hello world");
        	 test.test();
        }
}
