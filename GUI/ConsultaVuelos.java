package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import Class.*;

public class ConsultaVuelos {
    private JButton horariosDeVueloButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton consultarTarifasButton;
    private JButton consultarHorariosButton;

    List<Vuelo> vuelos = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();
    List<CompraBilletes> compras = new ArrayList<>();

    public ConsultaVuelos() {
        consultarHorariosButton.addActionListener(e->{
            String horariosDeVuelo = textField2.getText();
            for (Vuelo v : vuelos) {
                if (v.fechaVuelo().equalsIgnoreCase(horariosDeVuelo)) {
                    JOptionPane.showMessageDialog(null, v);
                }
            }
        });

        consultarTarifasButton.addActionListener(e->{
            String tarifas = textField1.getText();
            for (Vuelo v : vuelos) {
                if (v.fechaVuelo().equalsIgnoreCase(tarifas)) {
                    JOptionPane.showMessageDialog(null, v);
                }
            }
        });

    }
}
