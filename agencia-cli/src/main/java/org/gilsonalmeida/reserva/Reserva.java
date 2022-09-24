package org.gilsonalmeida.reserva;


import org.gilsonalmeida.cliente.Cliente;

public class Reserva {

    private long id;
    private long idCliente;

    public Reserva(){

    }

    private Reserva(long id, long idCliente) {
        this.id = id;
        this.idCliente = idCliente;
    }

    public static Reserva of(long id, long cliente){
        return new Reserva(id, cliente);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
}
