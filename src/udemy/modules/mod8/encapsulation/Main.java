package udemy.modules.mod8.encapsulation;

public class Main {
    public static void main(String[] args) {
////        Default constructor with no parameters gets created by Java (if did not create constructor in Player class)
//        Player player = new Player();
////        therefore need to manually set/initialise fields. (as set public!)
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
////        test methods on Player class
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        Structure to create new player hasn't changed, NEITHER has the method name to get health
        EnhancedPlayer sophia = new EnhancedPlayer("Sophia", 200, "Sword");
        System.out.println("Initial health is " + sophia.healthRemaining());


    }
}
