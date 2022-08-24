abstract class Common2 extends Common {
	protected String dob, mobileNo, email;

	Common2() {
	}

	Common2(String name, String dob, String mobileNo, String email) {
		super(name);
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	String getDob() {
		return dob;
	}

	String getMobileNo() {
		return mobileNo;
	}

	String getEmail() {
		return email;
	}
}
