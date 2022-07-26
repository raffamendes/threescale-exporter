package com.rmendes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("plan")
public class Plan {

    public Long id;
    @JsonProperty("name")
	public String name;
	public String type;
	public String state;
	public boolean approvalRequired;
	public double setupFee;
	public double costPerMonth;
	public Object trialPeriodDays;
	public int cancellationPeriod;
	public int serviceId;
	public boolean _default;
	public String text;
	public boolean custom;


    
    
}
