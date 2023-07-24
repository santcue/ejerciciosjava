package Exercice9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int votosAna = 0;
        int votosDiego = 0;

        for (int i = 0; i < 10; i++) {
            votar(votosAna, votosDiego);
        }

        if (votosAna > votosDiego) {
            JOptionPane.showMessageDialog(null, "El ganador es Ana Maria Suarez con " + votosAna + " votos");
            JOptionPane.showMessageDialog(null, "Diego Acero obtuvo " + votosDiego + " votos");
        } else if (votosDiego > votosAna) {
            JOptionPane.showMessageDialog(null, "El ganador es Diego Acero con " + votosDiego + " votos");
            JOptionPane.showMessageDialog(null, "Ana Maria Suarez obtuvo " + votosAna + " votos");
        } else {
            JOptionPane.showMessageDialog(null, "Empate entre Ana Maria Suarez y Diego Acero con " + votosAna + " votos cada uno");
        }
    }

    private static void votar(int votosAna, int votosDiego) {
        String voto = JOptionPane.showInputDialog(null, "Ingrese el número del candidato al que desea votar:\n\n1- Ana Maria Suarez\n2- Diego Acero");

        if (voto.equals("1")) {
            votosAna++;
            JOptionPane.showMessageDialog(null, "Su voto ha sido registrado");
        } else if (voto.equals("2")) {
            votosDiego++;
            JOptionPane.showMessageDialog(null, "Su voto ha sido registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Voto inválido. Introduzca 1 o 2 para votar");
        }
    }
}