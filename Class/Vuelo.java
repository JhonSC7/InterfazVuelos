package Class;

public class Vuelo {
    private String origen;
    private String destino;
    private String fecha;
    private String aerolinea;
    private double tarifa;
    private int asientos;

    public Vuelo(String origen, String destino, String fecha, String aerolinea, double tarifa, int asientos) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.aerolinea = aerolinea;
        this.tarifa = tarifa;
        this.asientos = asientos;
    }

    public String informacionDeVuelo () {
        return "Origen: " + origen + " Destino: " + destino + " fecha: " + fecha + " Aerolinea: " + aerolinea + " Tarifa: " + tarifa + " Asientos: " + asientos;
    }

    public double tarifaDeVuelo () {
        return tarifa;
    }

    public String origenVuelo () {
        return origen;
    }

    public String destinoVuelo () {
        return destino;
    }

    public String fechaVuelo () {
        return fecha;
    }

    public boolean hayAsientosDisponibles (int cantidad) {
        return asientos >= cantidad;
    }

    public void reservarAsientos (int cantidad) {
        if (hayAsientosDisponibles(cantidad)) {
            asientos-= cantidad;
        }
    }
}
