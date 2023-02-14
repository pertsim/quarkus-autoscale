package com.example

import org.jboss.resteasy.reactive.RestPath
import java.math.BigInteger
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class ExampleResource {




    @GET
    @Path("/count/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    fun count(@RestPath number: Int): List<String> {
        var t1: ULong = 0u
        var t2: ULong = 1u
        val serie = mutableListOf<String>()


        for (i in 1..number) {
            Thread.sleep(10)
            serie.add(t1.toString())

            val sum = t1 + t2
            t1 = t2
            t2 = sum
        }
        return serie
    }


}