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
	private String phonNumber;
	private String creditcard;
	private String bankaccount;
	private String password;
	
	public UserList() {
		initData(); 
	}
	private void initData() {
		// TODO Auto-generated method stub
		String line ="6373,Cornelia,Mowles,cmowles4@spotify.com,969-462-0098,180 Scofield Court,4026701292266090,612-450-6848,hhpag9kzXT";
		String [] field = line.split(",");
		setId(field[0]);
		setFirst_name(field[1]);
		setLast_name(field[2]);
		setEmail(field[3]);
		setPhonNumber(field[4]);
		setCreditcard(field[5]);
		setBankaccount(field[6]);
		setPassword(field[7]);
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
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
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
	
}
