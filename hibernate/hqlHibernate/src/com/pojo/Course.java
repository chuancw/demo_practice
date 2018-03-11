package com.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private BigDecimal cid;
	private String cname;
	private Short ccredit;
	private Set studcourses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(BigDecimal cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	/** full constructor */
	public Course(BigDecimal cid, String cname, Short ccredit, Set studcourses) {
		this.cid = cid;
		this.cname = cname;
		this.ccredit = ccredit;
		this.studcourses = studcourses;
	}

	// Property accessors

	public BigDecimal getCid() {
		return this.cid;
	}

	public void setCid(BigDecimal cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Short getCcredit() {
		return this.ccredit;
	}

	public void setCcredit(Short ccredit) {
		this.ccredit = ccredit;
	}

	public Set getStudcourses() {
		return this.studcourses;
	}

	public void setStudcourses(Set studcourses) {
		this.studcourses = studcourses;
	}

}