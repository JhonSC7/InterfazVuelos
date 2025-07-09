package GUI;

import javax.swing.*;
import Class.*;

import java.util.ArrayList;
import java.util.List;


public class Compra {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton confirmarButton;

    List<Vuelo> vuelos = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();
    List<CompraBilletes> compras = new ArrayList<>();

    public Compra() {
        confirmarButton.addActionListener(e->{
        String origen = textField1.getText();
        String destino = textField2.getText();
        String fecha = textField3.getText();
        String pasajeros = textField4.getText();
            for (Vuelo v : vuelos) {
                if (v.origenVuelo().equalsIgnoreCase(origen) && v.destinoVuelo().equalsIgnoreCase(destino) && v.fechaVuelo().equalsIgnoreCase(fecha)) {
                    Reserva reserva = new Reserva(usuario, v, pasajeros);
                    reservas.add(reserva);
                }
            }
        });
    }
}
