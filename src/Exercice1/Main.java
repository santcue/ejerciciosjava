package Exercice1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder numerosBuilder = new StringBuilder();

        int i = 2;
        int fin = 10;

        while (i <= fin) {
            numerosBuilder.append(i).append("\n");
            i++;
        }

        String numeros = numerosBuilder.toString();

        JOptionPane.showMessageDialog(null, numeros, "Números del 2 al 10", JOptionPane.PLAIN_MESSAGE);
    }
}


