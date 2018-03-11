package orm;

/**
 * B entity. @author MyEclipse Persistence Tools
 */

public class B implements java.io.Serializable {

	// Fields

	private Long id;
	private A a;
	private Long score;
	private String type;

	// Constructors

	/** default constructor */
	public B() {
	}

	/** full constructor */
	public B(A a, Long score, String type) {
		this.a = a;
		this.score = score;
		this.type = type;
	}
	public B(long score,String type){
		 this.score=score;
		 this.type=type;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public A getA() {
		return this.a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}