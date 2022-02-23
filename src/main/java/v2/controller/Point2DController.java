package v2.controller;

import v2.model.Point2D;

import java.util.Scanner;

public class Point2DController {
    public Point2D createPoint(String x, String y){
        try{                // tutaj jest kod któy może zgłaszać wyjątek
            int x_valid = Integer.parseInt(x);
            int y_valid = Integer.parseInt(y);
            return new Point2D(x_valid,y_valid);
        } catch (NumberFormatException e){         // tutuaj jest obsługa wyjątków
            System.out.println("Błąd walidacji tworzępunkt [0,0]");
            return new Point2D();
        }
    }
    public boolean isAGreatherThanB(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x,2) + Math.pow(a.y,2)) > Math.sqrt(Math.pow(b.x,2) + Math.pow(b.y,2));
    }
    public double calculateDistance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
    }
    public static void main(String[] args) {
        Point2DController point2DController = new Point2DController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie współrzędne");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        // walidator
        Point2D p1 = point2DController.createPoint(s1, s2);
        System.out.println(p1);
        System.out.println(point2DController.isAGreatherThanB(p1, new Point2D(2,3)));
        System.out.println(point2DController.calculateDistance(p1, p1));



    }

}
