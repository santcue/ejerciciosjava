package Exercice12;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        equipo1.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del primer equipo");
        equipo1.puntos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el marcador del primer equipo"));

        equipo2.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo equipo");
        equipo2.puntos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el marcador del segundo equipo"));

        Fecha[] fechas = new Fecha[3];

        for (int i = 0; i < 3; i++) {
            Fecha fecha = new Fecha();
            fecha.partidos = new Partido[2];

            for (int j = 0; j < 2; j++) {
                Partido partido = new Partido();

                partido.equipo = JOptionPane.showInputDialog(null,
                        String.format("Ingrese el nombre del equipo %d para la fecha %d", j + 1, i + 1));
                partido.puntos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        String.format("Ingrese el marcador del equipo %d para la fecha %d", j + 1, i + 1)));

                fecha.partidos[j] = partido;
            }

            fechas[i] = fecha;
        }

        for (Fecha fecha : fechas) {
            for (Partido partido : fecha.partidos) {
                if (partido.equipo.equals(equipo1.nombre)) {
                    equipo1.puntos += partido.puntos;
                } else if (partido.equipo.equals(equipo2.nombre)) {
                    equipo2.puntos += partido.puntos;
                }
            }
        }

        String ranking = String.format("Ranking de equipos:\n\n%s con %d puntos\n%s con %d puntos",
                equipo1.nombre, equipo1.puntos, equipo2.nombre, equipo2.puntos);

        JOptionPane.showMessageDialog(null, ranking);
    }

    static class Equipo {
        String nombre;
        int puntos;
    }

    static class Fecha {
        Partido[] partidos;
    }

    static class Partido {
        String equipo;
        int puntos;
    }
}

