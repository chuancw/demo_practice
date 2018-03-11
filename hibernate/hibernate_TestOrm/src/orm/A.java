package orm;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * A entity. @author MyEclipse Persistence Tools
 */

public class A implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private int anum;
	private Set bs = new HashSet(0);

	// Constructors

	/** default constructor */
	public A() {
	}

	/** minimal constructor */
	public A(String name, int anum) {
		this.name = name;
		this.anum = anum;
	}

	/** full constructor */
	public A(String name, int anum, Set bs) {
		this.name = name;
		this.anum = anum;
		this.bs = bs;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnum() {
		return this.anum;
	}

	public void setAnum(int anum) {
		this.anum = anum;
	}

	public Set getBs() {
		return this.bs;
	}

	public void setBs(Set bs) {
		this.bs = bs;
	}

}