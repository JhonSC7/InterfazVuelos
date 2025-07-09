package Class;

public class Reserva {
    private Usuario usuario;
    private Vuelo vuelo;
    private int pasajeros;
    private String estado;

    public Reserva(Usuario usuario, Vuelo vuelo, int pasajeros) {
        if (vuelo.hayAsientosDisponibles(pasajeros)) {
            this.usuario = usuario;
            this.vuelo = vuelo;
            this.pasajeros = pasajeros;
            estado = "reservado";
        }
    }

    public void cancelarReserva() {
        vuelo.reservarAsientos(pasajeros);
        estado = "cancelado";
    }

    public String mostrarVuelo() {
        return "" + vuelo.informacionDeVuelo() + " pasajeros: " + pasajeros;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

}
