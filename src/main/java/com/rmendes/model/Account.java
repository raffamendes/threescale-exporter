package com.rmendes.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "account")
public class Account {

	public Long id;

	@JsonProperty("created_at")
	@XmlElement(name = "created_at")
	public String createdAt;

	@JsonProperty("updated_at")
	@XmlElement(name = "updated_at")
	public String updated_at;

	public String state;

	@JsonProperty("monthly_billing_enabled")
	@XmlElement(name = "monthly_billing_enabled")
	public Boolean mBillingEnabled;

	@JsonProperty("monthly_charging_enabled")
    @XmlElement(name = "monthly_charging_enabled")
	public Boolean mChargingEnabled;

	@JsonProperty("credit_card_stored")
    @XmlElement(name = "credit_card_stored")
	public Boolean creditCardStored;

	public List<User> users;
}
