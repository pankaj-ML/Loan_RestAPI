package com.loan.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.entity.loanApplication;
import com.loan.exception.ApplicationExistException;
import com.loan.exception.ApplictionNotFound;
import com.loan.repository.ApplicationRepository;

@Service
public class ApplicationServiceLogic implements ApplicationService {
	
	@Autowired
	ApplicationRepository ApplicationRepository;

	@Override
	public loanApplication saveLoanApplication(loanApplication loanApplication) {
		try{
			ApplicationRepository.findById(loanApplication.getId()).get();
			throw new ApplicationExistException("Loan Application Already exist");
		 }
		catch(NoSuchElementException e) {
			ApplicationRepository.save(loanApplication);
			return loanApplication;
		}
	}

	public loanApplication approveLoanApplication(int id) {
		try {
			loanApplication loanApplication;
			loanApplication = ApplicationRepository.findById(id).get();
			loanApplication.setStatus("Approved");
			ApplicationRepository.deleteById(id);
			ApplicationRepository.save(loanApplication);
			return loanApplication;
		}
		catch(NoSuchElementException e){
			throw new ApplictionNotFound("Loan Application Not Found");
		}
		}

	@Override
	public loanApplication rejectLoanApplication(int id) {
		try {
			loanApplication loanApplication;
			loanApplication = ApplicationRepository.findById(id).get();
			loanApplication.setStatus("Rejected");
			ApplicationRepository.deleteById(id);
			ApplicationRepository.save(loanApplication);
			return loanApplication;
		}
		catch(NoSuchElementException e){
			throw new ApplictionNotFound("Loan Application Not Found");
		}
	} 


}
