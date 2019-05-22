package ye.model;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private Boolean isvip;
	private Double banlance;
	private String address;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsvip() {
		return isvip;
	}
	public void setIsvip(Boolean isvip) {
		this.isvip = isvip;
	}
	public Double getBanlance() {
		return banlance;
	}
	public void setBanlance(Double banlance) {
		this.banlance = banlance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age
				+ ", isvip=" + isvip + ", banlance=" + banlance + ", address="
				+ address + "]";
	}
	
	
}
