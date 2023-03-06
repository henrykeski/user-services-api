package com.learn.userservices.service;

import com.learn.userservices.domain.User;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Produces("application/json")
@Consumes("application/json")
@Path("/user")
public interface UserService {

    @GET
    @Path("/name")
    User getUserById();

    @GET
    @Path("/user")
    String getName();
}
