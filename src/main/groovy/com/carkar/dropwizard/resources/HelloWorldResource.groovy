package com.carkar.dropwizard.resources

import com.carkar.dropwizard.api.HelloThere

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Path("/hello")
@Produces("application/json; charset=utf-8")
class HelloWorldResource {

    @GET
    public HelloThere sayHello() {
        return new HelloThere(what: "Hello world!")
    }
}
