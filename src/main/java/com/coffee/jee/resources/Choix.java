package com.coffee.jee.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.coffee.jee.ejb.ChoixBean;
import com.coffee.jee.entity.Coffee;

@Path("choix")
public class Choix {

    @Inject
    ChoixBean choixBean;

    // static String types[] = { "Espresso", "Ristretto", "Lungo", "Caffe Gommosa",
    // "Café Con Hielo",
    // " Doppio", "Espresso con panna" };

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok(choixBean.getCoffees()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(Coffee c) {
        choixBean.addCoffee(c);
        return Response.ok().build();
    }

    @DELETE
    @Path("{name}")
    public Response delete(@PathParam("name") String name) {
        choixBean.deleteCoffeeByName(name);
        return Response.ok().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Coffee c) {
        choixBean.updatePrice(c);
        return Response.ok().build();

    }
}
