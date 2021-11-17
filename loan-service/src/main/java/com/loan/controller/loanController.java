package com.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.loan.entity.loanApplication;
import com.loan.service.*;
	
@RestController
@RequestMapping(value="/loan")
public class loanController {
	
	@Autowired
	ApplicationService ApplicationService;
	
	@PostMapping(value="/applyloan")
	public ResponseEntity<loanApplication> saveLoanApplicationToDb(@RequestBody loanApplication loanapplication)
	{
		return new ResponseEntity<loanApplication>(ApplicationService.saveLoanApplication(loanapplication),HttpStatus.OK);
	}
	
	@GetMapping(value = "/approveLoan/{loanId}")
	public ResponseEntity<loanApplication> approveLoanApplication(@PathVariable int loanId){
		return new ResponseEntity<loanApplication>(ApplicationService.approveLoanApplication(loanId), HttpStatus.OK);
	}
	
	@GetMapping(value = "/rejectLoan/{loanId}")
	public ResponseEntity<loanApplication> rejectLoanApplication(@PathVariable int loanId){
		return new ResponseEntity<loanApplication>(ApplicationService.rejectLoanApplication(loanId), HttpStatus.OK);
	}

}
