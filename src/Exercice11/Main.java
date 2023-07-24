package Exercice11;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] monedas = {500, 1000};
        int[] billetes = {2000, 5000};

        String tipoPago = JOptionPane.showInputDialog(null,
                "Ingrese el tipo de pago: moneda o billete");

        if (!tipoPago.equalsIgnoreCase("moneda") && !tipoPago.equalsIgnoreCase("billete")) {
            JOptionPane.showMessageDialog(null, "Tipo de pago incorrecto");
        } else {
            switch (tipoPago.toLowerCase()) {
                case "moneda": {
                    String montoPagoInput = JOptionPane.showInputDialog(null,
                            "Ingrese el monto a pagar");
                    try {
                        int montoPago = Integer.parseInt(montoPagoInput);

                        if (montoPago < 0) {
                            JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es válido");
                        } else {
                            if (contains(monedas, montoPago)) {
                                if (montoPago < 500) {
                                    JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es suficiente");
                                } else if (montoPago == 500) {
                                    JOptionPane.showMessageDialog(null, "El monto de pago ingresado es exacto");
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "El monto de pago ingresado es mayor al necesario. Devolución de "
                                                    + (montoPago - 500));
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La moneda ingresada no es válida");
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es válido");
                    }
                }
                break;

                case "billete": {
                    String montoPagoInput = JOptionPane.showInputDialog(null,
                            "Ingrese el monto a pagar");
                    try {
                        int montoPago = Integer.parseInt(montoPagoInput);

                        if (montoPago < 0) {
                            JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es válido");
                        } else {
                            if (contains(billetes, montoPago)) {
                                if (montoPago < 500) {
                                    JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es suficiente");
                                } else if (montoPago == 500) {
                                    JOptionPane.showMessageDialog(null, "El monto de pago ingresado es exacto");
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "El monto de pago ingresado es mayor al necesario. Devolución de "
                                                    + (montoPago - 500));
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El billete ingresado no es válido");
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El monto de pago ingresado no es válido");
                    }
                }
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Vuelva pronto!");
    }

    private static boolean contains(int[] array, int value) {
        for (int item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}
