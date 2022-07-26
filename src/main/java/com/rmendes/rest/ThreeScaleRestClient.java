package com.rmendes.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.rmendes.model.Account;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.vertx.core.json.JsonObject;

@RegisterRestClient(configKey = "threescale-api")
@Singleton
public interface ThreeScaleRestClient {
	
	@GET
	@Path("/admin/api/accounts.json")
	JsonObject getAllAccounts(@QueryParam(value = "access_token") String accessToken);
	
	@GET
	@Path("/admin/api/accounts/{account_id}/users.json")
	JsonObject getUsersByAccountList(@PathParam("account_id")Integer serviceId, @QueryParam(value = "access_token") String accessToken);
	
	@GET
	@Path("/admin/api/accounts/{account_id}/users/{id}.json")
	JsonObject getUsersByAccountIdUserId(@PathParam("account_id")Integer serviceId, @PathParam("id") Integer id, @QueryParam(value = "access_token") String accessToken);
	
	@POST
    @Path("/admin/api/signup.xml")
    Account createAccountByApi(
    		@QueryParam(value = "access_token") String accessToken, 
    		@QueryParam(value = "org_name")String orgName, 
    		@QueryParam(value = "username")String username,
    		@QueryParam(value = "email") String email,
    		@QueryParam(value = "password")String adminPassword,
    		@QueryParam(value = "account_plan_id")Integer accountPlanId,
    		@QueryParam(value = "service_plan_id")Integer servicePlanId,
    		@QueryParam(value = "application_plan_id")Integer applicationPlanId);




}
