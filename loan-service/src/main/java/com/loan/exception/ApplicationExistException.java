package com.loan.exception;

public class ApplicationExistException extends RuntimeException {

	private String msg;
	
	
	public ApplicationExistException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
