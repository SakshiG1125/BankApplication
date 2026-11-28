package com.exponent.bankapplication.model;

public class Account {
	private long accountNumber;
	private String name;
	private String adharcardNumber;
	private String pancardNumber;
	private long contact;
	private String email;
	private double accountBalance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharcardNumber() {
		return adharcardNumber;
	}

	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account Details:\n"
				+ "______________________________________________________________________________________________________________\n"
				+ "| Account Number | Name     | Adhaar No.     | Pancard No.  | Contact      | Email    | Account Balance |\n"
				+ "______________________________________________________________________________________________________________\n"
				+ "| " + accountNumber + "\t | " + name + "  | " + adharcardNumber + " \t  | " + pancardNumber
				+ "  \t | " + contact + " \t| " + email + "\t   | " + accountBalance + "\t     |\n"
				+ "______________________________________________________________________________________________________________\n";
	}
//		return "Account Details:\n" + "_________________________________________________________________________________________________\n"
//				+ "|[accountNumber | name\t|Adhaar No.\t|Pancard No.\t|Contact\t |Email\t |Account Balance|\n"
//				+ "|" + accountNumber +"  "+"\t   |" + name+"\t|" + adharcardNumber + "\t|" + pancardNumber + "\t|" + contact+"\t|"
//				+ email + "\t|" + accountBalance+"|\n|"
//				+ "________________________________________________________________________________________________|\n"	;

//	@Override
//	public String toString() {
//		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", adharcardNumber=" + adharcardNumber
//				+ ", pancardNumber=" + pancardNumber + ", contact=" + contact + ", email=" + email + ", accountBalance="
//				+ accountBalance + "]";
//	}

}
