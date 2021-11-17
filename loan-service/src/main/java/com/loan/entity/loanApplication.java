package com.loan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_DATA")
public class loanApplication {
	
	@Id
	private int Id;
	private String Bank;
	private int minloanAmount;
	private int maxloanAmount;
	private int minintrestRate;
	private int minCreditScore;
	private int termLength;
	private float processingFee;
	private int Rating;
	private String Status;
	
	
	
	public loanApplication(int id, String bank, int minloanAmount, int maxloanAmount, int minintrestRate,
			int minCreditScore, int termLength, float processingFee, int rating, String status) {
		super();
		Id = id;
		Bank = bank;
		this.minloanAmount = minloanAmount;
		this.maxloanAmount = maxloanAmount;
		this.minintrestRate = minintrestRate;
		this.minCreditScore = minCreditScore;
		this.termLength = termLength;
		this.processingFee = processingFee;
		this.Rating = rating;
		this.Status = status;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public int getMinloanAmount() {
		return minloanAmount;
	}
	public void setMinloanAmount(int minloanAmount) {
		this.minloanAmount = minloanAmount;
	}
	public int getMaxloanAmount() {
		return maxloanAmount;
	}
	public void setMaxloanAmount(int maxloanAmount) {
		this.maxloanAmount = maxloanAmount;
	}
	public int getMinintrestRate() {
		return minintrestRate;
	}
	public void setMinintrestRate(int minintrestRate) {
		this.minintrestRate = minintrestRate;
	}
	public int getMinCreditScore() {
		return minCreditScore;
	}
	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}
	public int getTermLength() {
		return termLength;
	}
	public void setTermLength(int termLength) {
		this.termLength = termLength;
	}
	public float getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		this.Rating = rating;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		this.Status = status;
	}
	
	
	
	
	

}
