package udemy.modules.mod8.encapsulation.printer;

public class Printer {
//    for encapsulation, make fields private
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

//    pagesPrinted = managed by class, and not parsed in when creating new printer
// don't need to put pagesPrinted = 0 as default value for a class variable that's an int, but can always specify for clarity

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

//        if return = -1, method does nothing to tonerLevel
        int tempAmount = this.tonerLevel + tonerAmount;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

//    Add GETTER to retrieve number of pages printed to check value was correct

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
