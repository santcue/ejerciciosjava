package Exercice4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String servicioInput = JOptionPane.showInputDialog(null, "Ingrese el servicio de limpieza que desea contratar:\n\n1- Lavado de prendas\n2- Planchado de prendas");

        switch (servicioInput) {
            case "1": {
                String tipoInput = JOptionPane.showInputDialog(null, "Ingrese el tipo de lavado que desea contratar:\n\n1- Lavado en seco\n2- Lavado normal");

                switch (tipoInput) {
                    case "1": {
                        String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de prendas que desea lavar");
                        try {
                            int cantidad = Integer.parseInt(cantidadInput);
                            int precio = cantidad * 2000;
                            JOptionPane.showMessageDialog(null, "El precio a pagar es de: " + precio);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                    case "2": {
                        String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de prendas que desea lavar");
                        try {
                            int cantidad = Integer.parseInt(cantidadInput);
                            int precio = cantidad * 1500;
                            JOptionPane.showMessageDialog(null, "El precio a pagar es de: " + precio);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Tipo de lavado inválido. Ingrese 1 o 2.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "2": {
                String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de prendas que desea planchar");
                try {
                    int cantidad = Integer.parseInt(cantidadInput);
                    int precio = cantidad * 1800;
                    int total = precio + 3000;
                    JOptionPane.showMessageDialog(null, "El precio a pagar es de: " + total + ", este incluye el costo del servicio de transporte");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Tipo de servicio inválido. Ingrese 1 o 2.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
