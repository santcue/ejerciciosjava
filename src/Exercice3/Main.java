package Exercice3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String costoInput;
        double costo, comision, total;

        while (true) {
            costoInput = JOptionPane.showInputDialog(null, "Ingrese el costo de la casa (Ingrese 0 para salir):");
            try {
                costo = Double.parseDouble(costoInput);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (costo <= 0) {
                break;
            }

            String tipoInput = JOptionPane.showInputDialog(null, "Ingrese el tipo de inmueble:\n\n1- Usado\n2- Nuevo");

            switch (tipoInput) {
                case "1":
                    comision = costo * 0.1;
                    total = costo - comision;
                    JOptionPane.showMessageDialog(null,
                            "⚪ El costo de la casa es: " + costo + "\n⚪ Valor recibido por el vendedor: " + total + "\n⚪ Valor recibido por la inmobiliaria: " + comision);
                    break;

                case "2":
                    comision = costo * 0.12;
                    total = costo - comision;
                    JOptionPane.showMessageDialog(null,
                            "⚪ El costo de la casa es: " + costo + "\n⚪ Valor recibido por el vendedor: " + total + "\n⚪ Valor recibido por la inmobiliaria: " + comision);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tipo de inmueble inválido. Ingrese 1 o 2.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

