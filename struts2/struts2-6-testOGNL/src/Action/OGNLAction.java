package Action;

import java.util.Map;

import instance.Student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OGNLAction extends ActionSupport {
	
	 private String name;
	 private Student student;
	 Map<String,Object> request;
	 
	 public OGNLAction(){
		 student =new Student();
		 student.setId(1);
		 student.setName("’≈»˝");
		 name="tom";
		 request=(Map<String, Object>) ActionContext.getContext().get("request");
	 }
	 public String execute(){
		 request.put("info", "request≤‚ ‘");
		 return SUCCESS;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Map<String, Object> getRequest() {
		return request;
	}
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
