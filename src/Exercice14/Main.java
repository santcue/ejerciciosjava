package Exercice14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Prompt the user for the number
        String input = JOptionPane.showInputDialog(null, "Ingrese el número para la tabla de multiplicar:", "Tabla de multiplicar", JOptionPane.PLAIN_MESSAGE);

        // Convert the input to an integer
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido. Ingrese un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Generate and show the multiplication table in a pop-up window
        StringBuilder table = new StringBuilder();
        table.append("-----------------------------\n");
        table.append("Tabla de multiplicar del ").append(num).append("\n");
        table.append("-----------------------------\n");

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            table.append(num).append("\t x \t").append(i).append("\t = \t").append(result).append("\n");
        }

        table.append("-----------------------------");

        JOptionPane.showMessageDialog(null, table.toString(), "Tabla de multiplicar", JOptionPane.PLAIN_MESSAGE);
    }
}

