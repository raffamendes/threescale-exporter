package com.rmendes.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("plan")
public class Plan extends ThreeScaleEntityBase {

    public Long id;
    @JsonProperty("name")
	public String name;
	public String type;
	public String state;
	@JsonProperty("approval_required")
	public boolean approvalRequired;
	@JsonProperty("setup_fee")
	public double setupFee;
	@JsonProperty("cost_per_month")
	public double costPerMonth;
	@JsonProperty("trial_period_days")
	public Object trialPeriodDays;
	@JsonProperty("cancellation_period")
	public int cancellationPeriod;
	@JsonIgnore
	public int serviceId;
	@JsonProperty("default")
	public boolean _default;
 	@JsonProperty("system_name")
	public String systemName;
	public boolean custom;
	public List<Link> links;
    
}
