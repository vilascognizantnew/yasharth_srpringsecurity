package com.cts.springsecurityjwtjpa.model;

public class AuthenticationResponse {

	private String jwt;

	
	
	public AuthenticationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

}
