package v2;


import v2.model.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(2,2);
        Point2D p3;
        System.out.println(p1);
        p1.x = 3;

        System.out.println(p1);
        System.out.println(p2);
        p3 = p2;
        p2.y = 10;
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println("AFTER CHANGES");
        System.out.println(p1);     // [3,0]
        System.out.println(p2);     // [2,10]
        System.out.println(p3);
        Point2D p4 = new Point2D(2,10);
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals(p4));


    }
}
