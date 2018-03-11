package com.pojo;

import java.math.BigDecimal;

/**
 * Studcourse entity. @author MyEclipse Persistence Tools
 */

public class Studcourse implements java.io.Serializable {

	// Fields

	private BigDecimal stucourseid;
	private Student student;
	private Course course;
	private BigDecimal grade;

	// Constructors

	/** default constructor */
	public Studcourse() {
	}

	/** minimal constructor */
	public Studcourse(BigDecimal grade) {
		this.grade = grade;
	}

	/** full constructor */
	public Studcourse(Student student, Course course, BigDecimal grade) {
		this.student = student;
		this.course = course;
		this.grade = grade;
	}

	// Property accessors

	public BigDecimal getStucourseid() {
		return this.stucourseid;
	}

	public void setStucourseid(BigDecimal stucourseid) {
		this.stucourseid = stucourseid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public BigDecimal getGrade() {
		return this.grade;
	}

	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}

}