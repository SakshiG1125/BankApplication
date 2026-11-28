package com.exponent.bankapplication.validation;

import java.util.Scanner;

import com.exponent.bankapplication.model.Account;

public class Validate {
	
	public static long getAccountNumber() {
		long accountNum = (long)(Math.random() * Math.pow(10,12 ));
		return accountNum;
		
	}
	
//	public static long getContactNumber() {
//		Account ac= new Account();
//		long contact=ac.getContact();
//		
//		if(contact>600000000 && contact<999999999) {
//			return contact;
//		}else {
//			System.out.println("Invalid Contact number!");
//			return getContactNumber();
//		}
//	
//	}
	
	public static long getContactNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Contact Number: ");
		long contact = sc.nextLong();
		
		if(contact > 6000000000l && contact < 9999999999l) {
			return contact;
		}else {
			System.out.println("Invalid Contact number!");
			
		}
		return getContactNumber();
	}
	
	
	

}
