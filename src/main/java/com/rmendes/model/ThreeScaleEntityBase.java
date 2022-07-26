package com.rmendes.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeScaleEntityBase {
	
	public Long id;
	
	@JsonProperty("created_at")
	@XmlElement(name = "created_at")
	public String createdAt;
	
	@JsonProperty("updated_at")
	@XmlElement(name = "updated_at")
	public String updatedAt;
	
		

}
