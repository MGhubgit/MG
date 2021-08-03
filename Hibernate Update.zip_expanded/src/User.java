import java.io.Serializable;
public class User implements Serializable{
	private Integer authenticate;
	private Integer userid;
	private String username; 
	private String password;   
	private String name;
	private String email; 

	public User() {}
	public User(Integer authenticate, String username, String password,Integer userid,String name,String email) {
		this.authenticate = authenticate;
		this.userid=userid;
		this.username = username;
		this.password= password;
		this.name= name;
		this.email= email;
	}
	public Integer getAuthenticate() {
		return authenticate;
	}
	public void setAuthenticate( Integer authenticate ) {
		this.authenticate = authenticate;
	}
	public Integer getuserid() {
		return userid;
	}
	public void setuserid( Integer userid ) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername( String username ) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword( String password ) {
		this.password = password;
	}
	public String getname() {
		return name;
	}
	public void setname( String name ) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail( String email ) {
		this.email = email;
	}
/*public String toString() {
	String s="Name:"+this.getname()+"\nUserId:"+this.getuserid()+"\nUserName:"+this.getUsername()+"\nPassword: "+this.getpassword()+"\nEmail-UD: "+this.getemail()+"\nAuthenticate: "+this.getAuthenticate();
	return s;
}
*/
}

