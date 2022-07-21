package com.rmendes.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "user")
public class User {

	public Long id;
    
    @JsonProperty("created_at")
	@XmlElement(name = "created_at")
	public String createdAt;

    @JsonProperty("updated_at")
	@XmlElement(name = "updated_at")
	public String updated_at;

    @JsonProperty("account_id")
	@XmlElement(name = "account_id")
	public Long accountId;

	public String state;

	public String role;

	public String username;

	public String email;

    @JsonProperty("extra_fields")
    @XmlElement(name = "extra_fields")
	public Boolean extraFields;
}
