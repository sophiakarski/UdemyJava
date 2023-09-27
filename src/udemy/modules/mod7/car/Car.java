package udemy.modules.mod7.car;

public class Car {

//    private fields - defined in class's code block -> defined in class (and not in method)
//    when create an object in this class, value we assign to these fields represent the state of the object
//    unlike local variables, class variables should have some type of access modifier declared for it
//    if don't declare, Java declares default (private) implicitly
//    REAL application: more fields :)
//    PRIVATE FIELDS:

//    if assign values, every object that is instantiated gets assigned those, instead of default (null / 0 / false):
    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Gray";
    private int doors = 2;
    private boolean convertible = true;

//    public method (but NOT STATIC)
//    IntelliJ can 'Generate' code for getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
//        this.make = make;
//        SET VALIDATION RULE:
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported ";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //    method will not be static, as accessing instance fields in the class
//    method would be public as we want to give way for users to interact with the object
//    METHOD (TEMPLATE CLASS):

    public void describeCar() {
        System.out.println(doors + "-Door " +
                colour + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

//    NEXT THING TO DO: create object on this class (as class is just template)
//    Must create object that takes blueprint (defined in class) and instantiate object to use
//    GO BACK TO 'Main.java'!!!!
}
