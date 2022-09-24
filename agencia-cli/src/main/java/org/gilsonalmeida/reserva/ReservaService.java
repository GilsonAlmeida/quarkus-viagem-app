package org.gilsonalmeida.reserva;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.gilsonalmeida.cliente.Cliente;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "http://localhost:8182/reserva")
public interface ReservaService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String newReserva(Reserva reserva);
}

