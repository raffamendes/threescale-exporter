package com.rmendes.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmendes.model.Account;
import com.rmendes.model.Application;
import com.rmendes.model.Plan;
import com.rmendes.model.NewAccount;
import com.rmendes.rest.ThreeScaleRestClient;
import com.rmendes.rest.ThreeScaleRestClientSource;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class ThreeScaleExporterService {
	
	@Inject
	@RestClient
	ThreeScaleRestClient client;
	
	@RestClient
	@Inject
	ThreeScaleRestClientSource clientSource;
	
	@ConfigProperty(name = "threescale.access.token")
	String accessToken;
	
	@ConfigProperty(name = "threescale.access.token.source")
	String accessTokenSource;

	
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
	
	public Account createAccount(NewAccount newAcc) {
		return client.createAccountByApi(accessToken, newAcc.orgName, newAcc.username, newAcc.email, newAcc.password, 6,5,7);
	}
	
	public List<Account> findAccountsSource(){
		return clientSource.getAllAccounts(accessTokenSource).getJsonArray("accounts").stream().
				map(s ->{
					try {
						Account acc =  new ObjectMapper().readValue(((JsonObject)s).getJsonObject("account").toString(), Account.class);
						Account detailedAcc = clientSource.getAccountById(accessTokenSource, acc.id);
						return detailedAcc;
					}catch (Exception e) {
						throw new RuntimeException(e);
					}
				}).collect(Collectors.toList());
	}

 	public List<Plan> findAllApplicationPlansSource(){
		List<Plan> plans = clientSource.getAllApplicationPlans(accessTokenSource).getJsonArray("plans").stream()
			.map(s ->{
				try {
					Plan plan =  new ObjectMapper().readValue(((JsonObject)s).getJsonObject("application_plan").toString(), Plan.class);
					return plan;
				}catch (Exception e) {
					throw new RuntimeException(e);
				}
			}).collect(Collectors.toList());
		return plans;
	}

	public List<Application> findAllApplicationSource(){
		List<Application> apps = clientSource.getAllApplication(accessTokenSource).getJsonArray("applications").stream()
			.map(s ->{
				try {
					Application app =  new ObjectMapper().readValue(((JsonObject)s).getJsonObject("application").toString(), Application.class);
					return app;
				}catch (Exception e) {
					throw new RuntimeException(e);
				}
			}).collect(Collectors.toList());
		return apps;
	}

	
}
