package v2.model;

public class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
//        return "["+x +", "+y + "]";
        return String.format("[%s,%s]", this.x, this.y);
    }
}
