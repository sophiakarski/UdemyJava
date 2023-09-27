package udemy.modules.mod7.person;

public class Main {
    public static void main(String[] args) {

        Person sophia = new Person();

        sophia.setFirstName("");
        sophia.setLastName("");
        sophia.setAge(10);

        System.out.println("Full name = " + sophia.getFullName());
        System.out.println("Teen = " + sophia.isTeen());

        sophia.setFirstName("John");
        sophia.setAge(18);

        System.out.println("Full name = " + sophia.getFullName());
        System.out.println("Teen = " + sophia.isTeen());

        sophia.setLastName("Smith");

        System.out.println("Full name = " + sophia.getFullName());
    }
}
