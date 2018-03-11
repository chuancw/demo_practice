package orm;

import java.util.Date;

/**
 * Sub entity. @author MyEclipse Persistence Tools
 */

public class Sub implements java.io.Serializable {

	// Fields

	private Long id;
	private Main main;
	private String subContent;
	private Date createtime;

	// Constructors

	/** default constructor */
	public Sub() {
	}

	/** full constructor */
	public Sub(Main main, String subContent, Date createtime) {
		this.main = main;
		this.subContent = subContent;
		this.createtime = createtime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public String getSubContent() {
		return this.subContent;
	}

	public void setSubContent(String subContent) {
		this.subContent = subContent;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}