package Exercice2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder numerosBuilder = new StringBuilder();

        for (int i = 1; i <= 6; i++) {
            if (i != 5) {
                numerosBuilder.append(i).append("\n");
            }
        }

        String numeros = numerosBuilder.toString();

        JOptionPane.showMessageDialog(null, numeros, "Números (Excluyendo 5)", JOptionPane.PLAIN_MESSAGE);
    }
}

