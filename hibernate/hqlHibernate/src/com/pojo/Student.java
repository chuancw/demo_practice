package com.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private BigDecimal sid;
	private String sname;
	private String ssex;
	private String sdept;
	private Short sage;
	private String aadress;
	private Set studcourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(BigDecimal sid, String sname, String ssex, String sdept,
			Short sage, String aadress) {
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sdept = sdept;
		this.sage = sage;
		this.aadress = aadress;
	}

	/** full constructor */
	public Student(BigDecimal sid, String sname, String ssex, String sdept,
			Short sage, String aadress, Set studcourses) {
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sdept = sdept;
		this.sage = sage;
		this.aadress = aadress;
		this.studcourses = studcourses;
	}

	// Property accessors

	public BigDecimal getSid() {
		return this.sid;
	}

	public void setSid(BigDecimal sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSsex() {
		return this.ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSdept() {
		return this.sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public Short getSage() {
		return this.sage;
	}

	public void setSage(Short sage) {
		this.sage = sage;
	}

	public String getAadress() {
		return this.aadress;
	}

	public void setAadress(String aadress) {
		this.aadress = aadress;
	}

	public Set getStudcourses() {
		return this.studcourses;
	}

	public void setStudcourses(Set studcourses) {
		this.studcourses = studcourses;
	}

}