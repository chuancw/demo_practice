package orm;

/**
 * SpringHibernateTable entity. @author MyEclipse Persistence Tools
 */

public class SpringHibernateTable implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String passwd;

	// Constructors

	/** default constructor */
	public SpringHibernateTable() {
	}

	/** full constructor */
	public SpringHibernateTable(String name, String passwd) {
		this.name = name;
		this.passwd = passwd;
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

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}