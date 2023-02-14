package com.example

import org.jboss.resteasy.reactive.RestPath
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello from RESTEasy Reactive"


    @GET
    @Path("/count/{number}")
    @Produces(MediaType.TEXT_PLAIN)
    fun count(@RestPath number: Int) = "Hello from RESTEasy Reactive $number"


}