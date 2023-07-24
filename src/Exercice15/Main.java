package Exercice15;

public class Main {
    public static void main(String[] args) {
        String aster = "*";
        String igual = "=";

        for (int i = 1; i <= 10; i++) {
            StringBuilder line = new StringBuilder();

            if (i % 2 == 0) {
                line.append(aster).append(" ").append(aster).append(" ").append(aster).append(" ").append(aster).append(" ").append(igual.repeat(35));
            } else {
                line.append(aster).append(" ").append(aster).append(" ").append(aster).append(" ").append(aster).append(" ").append(aster).append(igual.repeat(34));
            }

            System.out.println(line);
        }

        System.out.println(igual.repeat(43));
    }
}