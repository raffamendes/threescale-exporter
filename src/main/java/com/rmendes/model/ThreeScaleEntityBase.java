package com.rmendes.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeScaleEntityBase {
	
	public Long id;
	
	@JsonProperty("created_at")
	public LocalDateTime createdAt;
	
	@JsonProperty("updated_at")
	public LocalDateTime updatedAt;
	
		

}
