package Class;

public class CompraBilletes {
    private Usuario usuario;
    private Vuelo vuelo;

    public CompraBilletes(Usuario usuario, Vuelo vuelo, int pasajero) {
        this.usuario = usuario;
        this.vuelo = vuelo;
        vuelo.reservarAsientos(pasajero);
    }
}
