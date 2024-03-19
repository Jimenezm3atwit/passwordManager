package application;

public class Account {
	private String username, password, domain;
	
	public Account(String username, String password, String domain) {
		this.username = username;
		this.password = password;
		this.domain = domain;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public void editUsername(String username) {
		this.username = username;
	}
	
	public void editPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("Domain: %s, Username: %s, Password: %s", domain, username, password);
	}
}
