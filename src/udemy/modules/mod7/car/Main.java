package udemy.modules.mod7.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        car.make = "Porsche";
//        car.setMake("Porsche");
        car.setMake("Maserati");
//        ^ MASERATI IS UNSUPPORTED (per validation):
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColour("black");

//        System.out.println("make = " + car.make);
//        System.out.println("model = " + car.model);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();
//        null -> variable / attribute has type, but no reference to object

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColour("red");

        targa.describeCar();

//        :( UGLY ^ duplication of code, and painful to set data one attribute at a time on each object created.
//        There are better ways to set data on an object -> occurring when create object!
    }
}
