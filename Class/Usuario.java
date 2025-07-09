package Class;

public class Usuario {
    private String email;
    private String contraseña;
    private String tarjetaCredito;
    private String nombre;

    public Usuario(String email, String contraseña, String nombre) {
        this.email = email;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public Boolean validarCredenciales(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }

    public void registrarTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String obtenerNombre() {
        return nombre;
    }

}
