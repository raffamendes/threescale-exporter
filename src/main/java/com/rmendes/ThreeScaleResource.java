package com.rmendes;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmendes.model.Account;
import com.rmendes.rest.ThreeScaleRestClient;
import com.rmendes.service.ThreeScaleExporterService;

import io.quarkus.logging.Log;

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

    @GET
    @Path("accounts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccounts() {
        return Response.ok(client.getAllAccounts(accessToken)).build();
    }

    @GET
    @Path("account/{account_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAccountById(@PathParam("account_id") Integer accountId) {
        Log.debug("Hello");
        ObjectMapper mapper = new ObjectMapper();
        Account acct = client.getAccountById(accountId, accessToken);
        String accountAsJson = null;
        try {
            accountAsJson = mapper.writeValueAsString(acct);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Response.ok(accountAsJson).build();
    }
    
    
}