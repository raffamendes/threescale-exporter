package com.rmendes.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.rmendes.model.Account;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.vertx.core.json.JsonObject;

@RegisterRestClient(configKey = "threescale-api-source")
@Singleton
public interface ThreeScaleRestClientSource {
	
	
	@GET
	@Path("/admin/api/accounts.json")
	JsonObject getAllAccounts(@QueryParam(value = "access_token") String accessToken);
	
	@GET
	@Path("/admin/api/accounts/{id}")
	Account getAccountById(@QueryParam(value = "access_token") String accessToken, @PathParam("id") Long id);

	@GET
	@Path("/admin/api/application_plans.json")
	JsonObject getAllApplicationPlans(@QueryParam(value = "access_token") String accessToken);

	@GET
	@Path("/admin/api/applications.json")
	JsonObject getAllApplication(@QueryParam(value = "access_token") String accessToken);

	
}
