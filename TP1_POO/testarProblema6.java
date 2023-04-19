package Problema2;

import java.awt.Point;
import java.util.ArrayList;

public class testarProblema6 {
    public static void main(String[] args) {
        Problema6.Problema6 testando = new Problema6.Problema6(0);

        ArrayList<Point> locations = testando.shoot(45 /*o valor do angulo*/ , 50 /*velocidade inicail*/, 0.1/* intervalo de tempo*/);

        for (Point p : locations) {
            System.out.println("x = " + p.x + "  y = " + p.y);
        }
    }
}