package Exercice10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int puntuacion = 0;

        String pregunta1 = JOptionPane.showInputDialog(null,
                "1. ¿Cuál es la capital de Francia?\n\n1) París\n2) Madrid\n3) Roma");

        switch (pregunta1) {
            case "1": {
                puntuacion += 10;
                JOptionPane.showMessageDialog(null, "Correcto\n\nPuntuación: " + puntuacion);
            }
            break;

            case "2":
            case "3": {
                JOptionPane.showMessageDialog(null, "Incorrecto\n\nPuntuación: " + puntuacion);
            }
            break;
        }

        String pregunta2 = JOptionPane.showInputDialog(null,
                "2. ¿En qué año se descubrió América?\n\n1) 1942\n2) 1499\n3) 1492");

        switch (pregunta2) {
            case "3": {
                puntuacion += 10;
                JOptionPane.showMessageDialog(null, "Correcto\n\nPuntuación: " + puntuacion);
            }
            break;

            case "1":
            case "2": {
                JOptionPane.showMessageDialog(null, "Incorrecto\n\nPuntuación: " + puntuacion);
            }
            break;
        }

        String pregunta3 = JOptionPane.showInputDialog(null,
                "3. ¿Cuál es el río más largo del mundo?\n\n1) Amazonas\n2) Nilo\n3) Danubio");

        switch (pregunta3) {
            case "2": {
                puntuacion += 10;
                JOptionPane.showMessageDialog(null, "Correcto\n\nPuntuación: " + puntuacion);
            }
            break;

            case "1":
            case "3": {
                JOptionPane.showMessageDialog(null, "Incorrecto\n\nPuntuación: " + puntuacion);
            }
            break;
        }

        String pregunta4 = JOptionPane.showInputDialog(null,
                "4. ¿Cuál es el país más poblado del mundo?\n\n1) China\n2) India\n3) Estados Unidos");

        switch (pregunta4) {
            case "1": {
                puntuacion += 10;
                JOptionPane.showMessageDialog(null, "Correcto\n\nPuntuación: " + puntuacion);
            }
            break;

            case "2":
            case "3": {
                JOptionPane.showMessageDialog(null, "Incorrecto\n\nPuntuación: " + puntuacion);
            }
            break;
        }

        String pregunta5 = JOptionPane.showInputDialog(null,
                "5. ¿Cuál es el quinto planeta del sistema solar?\n\n1) Marte\n2) Júpiter\n3) Saturno");

        switch (pregunta5) {
            case "2": {
                puntuacion += 10;
                JOptionPane.showMessageDialog(null, "Correcto\n\nPuntuación: " + puntuacion);
            }
            break;

            case "1":
            case "3": {
                JOptionPane.showMessageDialog(null, "Incorrecto\n\nPuntuación: " + puntuacion);
            }
            break;
        }

        JOptionPane.showMessageDialog(null, "Puntuación final: " + puntuacion);
    }
}


