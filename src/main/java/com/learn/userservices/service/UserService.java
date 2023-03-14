package com.learn.userservices.service;

import com.learn.userservices.domain.User;

import javax.ws.rs.*;

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

    @PUT
    @Path("/addUser")
    void addUser(User user);
}
