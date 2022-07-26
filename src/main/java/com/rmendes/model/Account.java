package com.rmendes.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Account extends ThreeScaleEntityBase{
    
	public String state;
	@JsonProperty("org_name")
	public String orgName;
	public Object extraFields;
	@JsonProperty("monthly_billing_enabled")
	public boolean MonthlyBillingEnabled;
	@JsonProperty("monthly_charging_enabled")
	public boolean monthlyChargingEnabled;
	@JsonProperty("credit_card_stored")
	public boolean creditCardStored;
	
	public List<Plan> plans;
	//public List<User> users;
	
	public List<Link> links;

   



}
