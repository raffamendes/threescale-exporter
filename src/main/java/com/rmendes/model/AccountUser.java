package com.rmendes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountUser extends ThreeScaleEntityBase{
	
	@JsonProperty("account_id")
	public Long accountId;
	
	public String state;
	
	public String role;
	
	public String username;
	
	public String email;

}
