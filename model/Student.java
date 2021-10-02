package model;

public class Student {
	private static Student student;
	private Student() {
		
	}
	
	String fname;
	String lname;
	String email;
	String mobile;
	String password;
		
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + "]";
	}

	public static Student getInstance() {
		if(student == null) {
			return student = new Student();
		}
		return student;
	}

}
