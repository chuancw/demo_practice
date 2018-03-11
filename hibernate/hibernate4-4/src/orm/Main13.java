package orm;

import java.util.HashSet;
import java.util.Set;

/**
 * Main13 entity. @author MyEclipse Persistence Tools
 */

public class Main13 implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private String password;
	private Integer age;
	private Set sub13s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Main13() {
	}

	/** minimal constructor */
	public Main13(Long id, String username, String password, Integer age) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	/** full constructor */
	public Main13(Long id, String username, String password, Integer age,
			Set sub13s) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sub13s = sub13s;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set getSub13s() {
		return this.sub13s;
	}

	public void setSub13s(Set sub13s) {
		this.sub13s = sub13s;
	}

}