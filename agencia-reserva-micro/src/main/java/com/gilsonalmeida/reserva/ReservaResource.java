package com.gilsonalmeida.reserva;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reserva")
public class ReservaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserva> get() {
        return Reserva.listAll();
    }

    //
//    @GET
//    @Path("findById")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Cliente findById(@QueryParam("id") long id){
//        return Cliente.findById(id);
//    }
//
//    @Transactional
//    @DELETE
//    @Path("deleteById")
//    public void deleteById(@QueryParam("id") long id){
//        Cliente.deleteById(id);
//    }
//
    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Reserva newReserva(Reserva reserva) {
        reserva.id = null;
        reserva.persist();

        return reserva;
    }
}
