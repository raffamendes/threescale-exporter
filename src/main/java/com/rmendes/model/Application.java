package com.rmendes.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("application")
public class Application extends ThreeScaleEntityBase{
    
    public int id;
    public String state;
    public String name;
    public String description;
    @JsonProperty("extra_fields")
    public String extraFields;
    @JsonProperty("user_account")
    public String userAccount;
    @JsonProperty("first_traffic_at")
    public Date firstTrafficAt;
    @JsonProperty("first_daily_traffic_at")
    public Date firstDailyTrafficAt;
    @JsonProperty("service_id")
    public int serviceId;
    @JsonProperty("service_name")
    public String serviceName;
    @JsonProperty("user_key")
    public String userKey;
    @JsonProperty("provider_verification_key")
    public String providerVerificationKey;
    @JsonProperty("plan_id")
    public String planId;
    @JsonProperty("plan_name")
    public String planName;
    public Plan plan;
    public List<Link> links;    
    public boolean enabled;
    @JsonProperty("org_name")
    public String orgName;
    @JsonProperty("account_id")
    public int accountId;    
    
}