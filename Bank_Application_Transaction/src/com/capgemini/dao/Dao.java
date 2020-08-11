package com.capgemini.dao;

import com.capgemini.bean.Account;
import com.capgemini.bean.Loan;

public interface Dao {
	Account getDetails(String accountId);
	Loan getLoan(Loan loan,String accountNumber);
	Loan showLoanDetails(int loanid);

	Double withdrawAmount(String accountId,Integer amount);
	Loan payLoan(Integer loanid,Double loanamount);
	void createAccount(Account account);
	Double depositAmount(String accountid, Integer amount);


}
