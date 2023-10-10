package udemy.modules.mod8.encapsulation.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

//        print odd number of pages to test calculation for duplex printing
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

//        :) hide functionality from other classes - not accessing any fields directly, proper methods doing calculations and VALIDATION away from the user.
    }
}
