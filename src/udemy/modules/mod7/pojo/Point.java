package udemy.modules.mod7.pojo;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt((getX()*getX()) + (getY()*getY()));
    }

    public double distance(Point point) {
        return (distance(point.x, point.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x-getX())*(x-getX())) + ((y-getY())*(y-getY())));
    }

}
