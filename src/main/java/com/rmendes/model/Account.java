package com.rmendes.model;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "account")
public class Account extends ThreeScaleEntityBase{
    
	public String state;
	@XmlElement(name = "org_name")
	public String orgName;
	public Object extraFields;
	@XmlElement(name = "monthly_billing_enabled")
	public boolean MonthlyBillingEnabled;
	@XmlElement(name = "monthly_charging_enabled")
	public boolean monthlyChargingEnabled;
	@XmlElement(name = "credit_card_stored")
	public boolean creditCardStored;
	
	@XmlElement(name = "plans")
	public List<Plan> plans;
	//public List<User> users;

   



}
