package Problema1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> points = new ArrayList<>();

        System.out.println("Insira as coordenadas (x,y) de cada ponto, separadas por espaço, e com virgula, digite 'fim' para terminar");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                break;
            }

            String[] coordinates = input.split(" ");
            double x = Double.parseDouble(coordinates[0]);
            double y = Double.parseDouble(coordinates[1]);

            points.add(x);
            points.add(y);
        }

        for (int i = 0; i < points.size() - 3; i += 2) {
            double x1 = points.get(i);
            double y1 = points.get(i + 1);
            double x2 = points.get(i + 2);
            double y2 = points.get(i + 3);

            double distance = distanciaDePontos(x1, y1, x2, y2);
            DecimalFormat df = new DecimalFormat("#.##");
            String valorFormatado = df.format(distance);

            System.out.println("Distância entre os pontos (ponto 1 : " + x1 + "," + y1 + ") e (ponto 2 : " + x2 + "," + y2 + "): " + valorFormatado);
        }
    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}