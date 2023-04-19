package Problema8;

import java.util.Random;

public class Problema8 {
    public static void main(String[] args) {
        double resNominal = 280;
        double tol = 0.15; // tolerancia 15%
        int numResistencias = 8;

        Random rand = new Random();

        for (int i = 0; i < numResistencias; i++) {
            double var = rand.nextDouble() * tol * 2 - tol;
            double resistencia = resNominal * (1 + var);

            System.out.printf("Resistência %d: %.2f ohm\n", i+1, resistencia);
        }
    }
}
