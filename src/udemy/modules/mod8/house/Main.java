package udemy.modules.mod8.house;

import udemy.modules.mod8.house.bedroom.*;
import udemy.modules.mod8.house.kitchen.SmartKitchen;

public class Main {

    public static void main(String[] args) {
//        KITCHEN
        SmartKitchen kitchen = new SmartKitchen();

//        USE GET METHODS TO CALL METHODS ON SPECIFIC PARTS OF THE KITCHEN
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

//        Set state of appliances
        kitchen.setKitchenState(true, false, true);
//        Perform kitchen work
        kitchen.doKitchenWork();

//        BEDROOM

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Sophia", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
