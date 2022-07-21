package com.rmendes.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmendes.model.AccountUser;
import com.rmendes.rest.ThreeScaleRestClient;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class ThreeScaleExporterService {
	
	@Inject
	@RestClient
	ThreeScaleRestClient client;
	
	@ConfigProperty(name = "threescale.access.token")
	String accessToken;
	
	public List<JsonArray> getUsersByAccountList(JsonObject accountList) {
		System.out.println(accountList.getJsonArray("accounts").getJsonObject(0).getJsonObject("account").getInteger("id"));
		return accountList.getJsonArray("accounts")
				.stream().map(s ->
				{
					try{
						Integer id = ((JsonObject) s).getJsonObject("account").getInteger("id");
						return client.getUsersByAccountList(id, accessToken).getJsonArray("users");
					}catch (Exception e) {
						e.printStackTrace();
						throw new RuntimeException();
					}
				}).collect(Collectors.toList());
				
	}

}
