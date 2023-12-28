package com.exception;

public class CheckingAccount {

	int acno;
	double balance;
	String cname;
	public CheckingAccount(int acno, String cname,double balance) {
		this.acno = acno;
		this.cname=cname;
		this.balance = balance;
		System.out.println("Hello "+cname+", Your Account Number "+acno+" Is Opened With "+balance);
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InSufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSufficientFund(needs);
		}
	}
	public void checkBalance() {
		System.out.println("Current Balance : "+this.balance);
	}
	
}
