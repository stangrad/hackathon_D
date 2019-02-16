	package user.model;
/**
 * Class - deal with user information and functions.
 * @author Yunting Wang
 *
 */
public class UserList {
//id,first_name,last_name,email,phoneNumber,address,creditcard,bankaccount,password
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String phoneNumber;
	private String address;
	private String creditcard;
	private String bankaccount;
	private String password;
	
	public UserList() {
		id="";
		first_name="";
		last_name="";
		email="";
		phoneNumber="";
		setAddress("");
		creditcard="";
		bankaccount="";
		password="";
	}
	public UserList(String id, String first_name, String last_name, String email, String phonNumber, String address, 
			String creditcard, String bankaccount, String password) {
		setId(id);
		setFirst_name(first_name);
		setLast_name(last_name);
		setEmail(email);
		setPhonNumber(phoneNumber);
		setCreditcard(address);
		setBankaccount(creditcard);
		setPassword(password);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonNumber() {
		return phoneNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phoneNumber = phonNumber;
	}
	public String getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
	public String getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("User Information: %s,%s,%s,%s,%s,%s,%s,%s,%s",
						getId(), getFirst_name(),getLast_name(), getEmail(),getPhonNumber(),
						getCreditcard(),getBankaccount(),getPassword());
				
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
