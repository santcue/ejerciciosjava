package Exercice6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String menuInput = JOptionPane.showInputDialog(null, "Menu de opciones:\n\n1- Pizza 🍕\n2- Sandwich 🥪\n3- Ensaladas 🥗");

        switch (menuInput) {
            case "1": {
                String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pizzas que desea");
                try {
                    int cantidad = Integer.parseInt(cantidadInput);
                    int precio = cantidad * 7000;

                    String salsaInput = JOptionPane.showInputDialog(null, "¿Desea agregar salsa por un valor de $3000?\n\nSi\nNo");

                    if (salsaInput.equalsIgnoreCase("Si")) {
                        int precioSalsa = precio + 3000;
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precioSalsa);
                    } else if (salsaInput.equalsIgnoreCase("No")) {
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precio);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese Si o No.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "2": {
                String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de sandwiches que desea");
                try {
                    int cantidad = Integer.parseInt(cantidadInput);
                    int precio = cantidad * 5000;

                    String salsaInput = JOptionPane.showInputDialog(null, "¿Desea agregar salsa por un valor de $3000?\n\nSi\nNo");

                    if (salsaInput.equalsIgnoreCase("Si")) {
                        int precioSalsa = precio + 3000;
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precioSalsa);
                    } else if (salsaInput.equalsIgnoreCase("No")) {
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precio);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese Si o No.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            case "3": {
                String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de ensaladas que desea");
                try {
                    int cantidad = Integer.parseInt(cantidadInput);
                    int precio = cantidad * 15000;

                    String salsaInput = JOptionPane.showInputDialog(null, "¿Desea agregar salsa por un valor de $3000?\n\nSi\nNo");

                    if (salsaInput.equalsIgnoreCase("Si")) {
                        int precioSalsa = precio + 3000;
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precioSalsa);
                    } else if (salsaInput.equalsIgnoreCase("No")) {
                        JOptionPane.showMessageDialog(null, "El precio total es de: " + precio);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese Si o No.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Ingrese 1, 2 o 3.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
