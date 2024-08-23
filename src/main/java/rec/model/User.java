package rec.model;

public class User {
	
	private String custName;
	private String mobNo;
	private String email;
	private String password;
	
	public User(String custName, String mobNo, String email, String password) {
		super();
		this.custName = custName;
		this.mobNo = mobNo;
		this.email = email;
		this.password = password;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
