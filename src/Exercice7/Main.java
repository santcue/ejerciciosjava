package Exercice7;

import javax.swing.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String multaInput = JOptionPane.showInputDialog(null,
                "Ingrese el módulo que desea usar:\n\n- Devolución\n- Perdida");

        switch (multaInput.toLowerCase()) {
            case "devolucion": {
                String diasInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de días de retraso");
                try {
                    int dias = Integer.parseInt(diasInput);

                    String prestamoInput = JOptionPane.showInputDialog(null,
                            "Ingrese qué tipo de préstamo es:\n\n- Libro\n- Revista");

                    switch (prestamoInput.toLowerCase()) {
                        case "libro": {
                            String cantidadInput = JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de libros prestados");
                            try {
                                int cantidad = Integer.parseInt(cantidadInput);
                                int multa = dias * 600 * cantidad;
                                JOptionPane.showMessageDialog(null, "La multa es de: " + multa);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;

                        case "revista": {
                            String cantidadInput = JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de revistas prestadas");
                            try {
                                int cantidad = Integer.parseInt(cantidadInput);
                                int multa = dias * 500 * cantidad;
                                JOptionPane.showMessageDialog(null, "La multa es de: " + multa);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        break;

                        default:
                            JOptionPane.showMessageDialog(null, "Tipo de préstamo inválido. Ingrese Libro o Revista.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "perdida": {
                String perdidaInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de libros perdidos");
                try {
                    int perdida = Integer.parseInt(perdidaInput);
                    int multa = perdida * 10000;
                    JOptionPane.showMessageDialog(null, "La multa es de: " + multa);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Módulo inválido. Ingrese Devolucion o Perdida.", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}
