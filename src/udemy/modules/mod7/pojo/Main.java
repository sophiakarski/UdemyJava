package udemy.modules.mod7.pojo;

import udemy.modules.mod7.pojo.floorPriceCalculator.Calculator;
import udemy.modules.mod7.pojo.floorPriceCalculator.Carpet;
import udemy.modules.mod7.pojo.floorPriceCalculator.Floor;

public class Main {
    public static void main(String[] args) {

//        Wall
        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

        System.out.println();

//        Point
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());

        System.out.println();

//        Calculator floor / carpet
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());

        System.out.println();

//        Complex Number
        ComplexNumber oneComplexNumber = new ComplexNumber(1.0, 1.0);
        ComplexNumber anotherComplexNumber = new ComplexNumber(2.5, -1.5);

        oneComplexNumber.add(1,1);
        System.out.println("oneComplexNumber.real = " + oneComplexNumber.getReal());
        System.out.println("oneComplexNumber.imaginary = " + oneComplexNumber.getImaginary());

        oneComplexNumber.subtract(anotherComplexNumber);
        System.out.println("oneComplexNumber.real = " + oneComplexNumber.getReal());
        System.out.println("oneComplexNumber.imaginary = " + oneComplexNumber.getImaginary());

        anotherComplexNumber.subtract(oneComplexNumber);
        System.out.println("anotherComplexNumber.real = " + anotherComplexNumber.getReal());
        System.out.println("anotherComplexNumber.imaginary = " + anotherComplexNumber.getImaginary());
    }
}
