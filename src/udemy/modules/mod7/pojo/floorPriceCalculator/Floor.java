package udemy.modules.mod7.pojo.floorPriceCalculator;

public class Floor {

    // not declared as final...(?)
    private double width;
    private double length;

    public Floor(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.length = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * length;
    }

}
