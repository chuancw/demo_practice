package action;

import com.opensymphony.xwork2.ActionSupport;

public class CalculatorAction extends ActionSupport {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String calculate() throws Exception{
		c=a/b;
		return SUCCESS;
	}
	

}
