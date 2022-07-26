package com.rmendes.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.vertx.core.json.JsonObject;

@RegisterRestClient(configKey = "threescale-api-source")
@Singleton
public interface ThreeScaleRestClientSource {
	
	
	@GET
	@Path("/admin/api/accounts.json")
	JsonObject getAllAccounts(@QueryParam(value = "access_token") String accessToken);

}
