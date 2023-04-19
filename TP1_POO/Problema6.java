package Problema6;

import java.awt.Point;
import java.util.ArrayList;

public class Problema6 {
    private double x;
    private double y;
    private double vel_x;
    private double vel_y;

    private final double g = 9.81;

    public Problema6(double x) {
        this.x = x;
        this.y = 0;
        this.vel_x = 0;
        this.vel_y = 0;
    }

    public void move(double deltaSec) {
        double dx = this.vel_x * deltaSec;
        double dy = this.vel_y * deltaSec - 0.5 * this.g * deltaSec * deltaSec;

        this.x += dx;
        this.y += dy;

        this.vel_y -= this.g * deltaSec;
    }

    public Point getLocation() {
        return new Point((int)Math.round(this.x), (int)Math.round(this.y));
    }

    public ArrayList<Point> shoot(double alpha, double v, double deltaSec) {
        this.vel_x = v * Math.cos(Math.toRadians(alpha));
        this.vel_y = v * Math.sin(Math.toRadians(alpha));

        ArrayList<Point> locations = new ArrayList<>();

        while (this.y >= 0) {
            this.move(deltaSec);
            locations.add(this.getLocation());
        }

        return locations;
    }
}
