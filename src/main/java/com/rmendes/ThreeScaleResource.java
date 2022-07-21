package com.rmendes;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rmendes.rest.ThreeScaleRestClient;
import com.rmendes.service.ThreeScaleExporterService;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/scale")
public class ThreeScaleResource {
	
	@RestClient
	@Inject
	ThreeScaleRestClient client;
	
	@ConfigProperty(name = "threescale.access.token")
	String accessToken;
	
	@Inject
	ThreeScaleExporterService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsersByAccountList() {
        return Response.ok(service.getUsersByAccountList(client.getAllAccounts(accessToken))).build();
    }
    
    @GET
    @Path("users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserByAccountIdUserId(@QueryParam(value = "account") Integer account, @QueryParam(value = "user") Integer user) {
        return Response.ok(client.getUsersByAccountIdUserId(account, user, accessToken)).build();
    }
    
    
}