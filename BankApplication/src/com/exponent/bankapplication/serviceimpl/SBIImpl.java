package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.validation.Validate;

public class SBIImpl implements RBI {
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	boolean isAccoutCreated = false;

	@Override
	public void createAccount() {
//		System.out.println("Enter your account number: ");
//		int accNo = sc.nextInt();
//		ac.setAccountNumber(accNo);

		System.out.println("Enter your Name: ");
		String name = sc.next();
		ac.setName(name);

		System.out.println("Enter your Addhar number: ");
		ac.setAdharcardNumber(sc.next());

		System.out.println("Enter your Pancard number: ");
		ac.setPancardNumber(sc.next());

//		System.out.println("Enter your valid Contact number: ");
//		ac.setContact(sc.nextLong());
//		long contactNum = Validate.getContactNumber();
//		System.out.println(contactNum);
		long contactNumber = Validate.getContactNumber();
		ac.setContact(contactNumber);

		System.out.println("Enter your valid Email-id: ");
		ac.setEmail(sc.next());

		System.out.println("Enter account opening amount: ");
		ac.setAccountBalance(sc.nextDouble());

		long accountNumber = Validate.getAccountNumber();
		System.out.println("Your Account number is: " + accountNumber);
		ac.setAccountNumber(accountNumber);

		isAccoutCreated = true;

		System.out.println("Account created successfully!!!");

	}

	@Override
	public void showAccountDetails() {
//		System.out.println(ac);
		if (isAccoutCreated) {
			System.out.println("Enter your account number: ");
			long accontNo = sc.nextLong();
			if (accontNo == ac.getAccountNumber()) {
				System.out.println(ac);
			} else {
				System.out.println("Account doesn't exist.");
			}
		} else {
			System.out.println("You need to first create the account.");
			createAccount();
		}
	}

	@Override
	public void showAccountBalance() {
		if (isAccoutCreated) {
			System.out.println("Enter your account number: ");
			long accontNo = sc.nextLong();
			if (accontNo == ac.getAccountNumber()) {
				System.out.println("Current Account balance: " + ac.getAccountBalance());
			} else {
				System.out.println("Account doesn't exist.");
			}
		} else {
			System.out.println("You need to first create the account.");
			createAccount();
		}
	}

	@Override
	public void withdrawMoney() {
		if (isAccoutCreated) {
			System.out.println("Enter your account number: ");
			long accontNo = sc.nextLong();
			if (accontNo == ac.getAccountNumber()) {
				System.out.println("Enter the amount you want to withdraw: ");
				double withDraw = sc.nextDouble();
				if (withDraw <= 0 || withDraw % 100 != 0) {
					System.out.println("Invalid amount! Enter amount in multiple of 100");
					return;
				}

				if (withDraw >= ac.getAccountBalance()) {
					System.out.println("Insufficient Balance");
					return;
				}

				double updatedBalance = ac.getAccountBalance() - withDraw;
				ac.setAccountBalance(updatedBalance);

				System.out.println("Succesfull withdraw of Rs. " + withDraw);
				System.out.println("Your current updated balance is: " + updatedBalance);
			} else {
				System.out.println("Enter correct account number!");
				withdrawMoney();
			}
		} else {
			System.out.println("You need to first create the account.");
			createAccount();
		}
	}

	@Override
	public void depositeMoney() {
		if (isAccoutCreated) {
			System.out.println("Enter your account number: ");
			long accontNo = sc.nextLong();
			if (accontNo == ac.getAccountNumber()) {
				System.out.println("Enter the amount you want to deposit: ");
				double deposit = sc.nextDouble();

				if (deposit <= 0) {
					System.out.println("Deposite amount must be greater than 0");
					return;
				}
				double updatedBalance = ac.getAccountBalance() + deposit;
				ac.setAccountBalance(updatedBalance);

				System.out.println("Amount Deposited Successfully");
				System.out.println("Your current updated balance is: " + updatedBalance);
			} else {
				System.out.println("Enter correct account number!");
				depositeMoney();
			}
		} else {
			System.out.println("You need to first create the account.");
			createAccount();
		}
	}

	@Override
	public void updateAccountDetails() {
		if (isAccoutCreated) {
			System.out.println("Enter your account number: ");
			long accontNo = sc.nextLong();
			if (accontNo == ac.getAccountNumber()) {
			
			System.out.println("___________________________");
			System.out.println("|  Update Account detail:  |");
			System.out.println("----------------------------");
			System.out.println("|1.| Update Contact number |");
			System.out.println("|2.| Update Email Address  |");
			System.out.println("|3.| Update both           |");
			System.out.println("|__|_______________________|");
			System.out.println("\nEnter your choice:        ");

			int ch = sc.nextInt();

			if (ch < 1 || ch > 3) {
				System.out.println("Invalid Choice");
				return;
			}

			if (ch == 1 || ch == 3) {
				System.out.println("Enter new Contact number: ");
				long newContact = sc.nextLong();

//		long updatedContact = ac.setContact(newContact); 
				ac.setContact(newContact);
				System.out.println("Contact succesfully updated");
			}

			if (ch == 2 || ch == 3) {
				System.out.println("Enter new Email Address: ");
				String newEmail = sc.next();

//			long updatedContact = ac.setContact(newContact); 
				ac.setEmail(newEmail);
				;
				System.out.println("Email succesfully updated");
			}
		}else {
			System.out.println("Enter correct account number!");
			updateAccountDetails();
		}
			}
		
		else {
			System.out.println("You need to first create the account.");
			createAccount();
		}

	}
}
