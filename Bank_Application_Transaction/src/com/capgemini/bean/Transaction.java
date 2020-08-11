package com.capgemini.bean;

public class Transaction extends Loan {
     public Transaction(String loanId, String loanType, double loanAmount, double amount) {
		super(loanId, loanType, loanAmount);
		this.amount = amount;
	}

	

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + "]";
	}
     
     

}
