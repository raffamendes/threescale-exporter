package com.rmendes.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeScaleEntityBase {
	
    @JsonProperty("id")
	public Long id;
	@JsonProperty("created_at")
	public LocalDate createdAt;
	@JsonProperty("updated_at")
	public LocalDate updated_at;
	
		

}
