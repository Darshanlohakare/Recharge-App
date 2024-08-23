package rec.model;

public class Admin {
	
	private String adName;
	private String email;
	private String password;
	
	public Admin(String adName, String email, String password) {
		super();
		this.adName = adName;
		this.email = email;
		this.password = password;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
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
