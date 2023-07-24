package Exercice8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String triangulo = JOptionPane.showInputDialog(null, "Ingrese los lados del triángulo separados por coma (,) para verificar si es equilátero");

        String[] lados = triangulo.split(",");
        int lado1 = Integer.parseInt(lados[0]);
        int lado2 = Integer.parseInt(lados[1]);
        int lado3 = Integer.parseInt(lados[2]);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "El triángulo es escaleno");
        }
    }
}

