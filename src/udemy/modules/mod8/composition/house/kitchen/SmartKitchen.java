package udemy.modules.mod8.composition.house.kitchen;
// 103 - Composition Challenge
// composition, encapsulation, abstraction
// encapsulates individual appliances w/ respective classes b('SmartKitchen class manages their interactions)
// provide high level interface for performing kitchen tasks
public class SmartKitchen {

//    Attributes (must create the classes)
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

//    ENCAPSULATE details of how the appliances are set up + what their initial states are
//    Hides complexity of appliance initialisation from external code
//    (users of 'SmartKitchen' class don't need to be concerned w/ specifics of creating and configuring individual appliances)
//    MODULARITY - each appliance is separate module w/ own functionality + state = MAINTAIN :)
//    ABSTRACTION: allows focus on interactions betw appliances rather than their instantiation

//    instantiate own set of appliances by create own arguments constructor
//    any code creating SmartKitchen have to create appliances individually
    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

//    hide details on calling code w/ 2 below methods:
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

//    This method hides what work will be done on the calling code, doesn't care about the individual work items
    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

// appliances not extending any class (no inheritance)
class CoffeeMaker {

//    attribute:
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
