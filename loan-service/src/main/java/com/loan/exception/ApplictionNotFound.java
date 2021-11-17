package com.loan.exception;

public class ApplictionNotFound extends RuntimeException {

	private String msg;

	
	public ApplictionNotFound(String msg) {
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
