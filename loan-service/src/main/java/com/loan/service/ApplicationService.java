package com.loan.service;






import com.loan.entity.loanApplication;


public interface ApplicationService {
    

	loanApplication saveLoanApplication(loanApplication loanApplication);
	loanApplication approveLoanApplication(int loanId);
	loanApplication rejectLoanApplication(int loanId);
	
	
}
