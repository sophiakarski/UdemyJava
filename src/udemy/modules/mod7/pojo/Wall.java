package udemy.modules.mod7.pojo;

public class Wall {

//    Declare these instance variables as private for ENCAPSULATION:
//    Objects internal representation hidden from outside world
//    Therefore can control and validate data access - ensure it stays in acceptable bounds.
//    e.g. in getter/setter methods - controls (conditional checks)

//    Maintainability / Flexibility - separation of concerns, does not affect public interface (refactor if needed)
//    Security!
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 :height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }

}
