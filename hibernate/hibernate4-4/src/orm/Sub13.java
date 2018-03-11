package orm;

/**
 * Sub13 entity. @author MyEclipse Persistence Tools
 */

public class Sub13 implements java.io.Serializable {

	// Fields

	private Long id;
	private Main13 main13;
	private String title;

	// Constructors

	/** default constructor */
	public Sub13() {
	}

	/** full constructor */
	public Sub13(Long id, Main13 main13, String title) {
		this.id = id;
		this.main13 = main13;
		this.title = title;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Main13 getMain13() {
		return this.main13;
	}

	public void setMain13(Main13 main13) {
		this.main13 = main13;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}