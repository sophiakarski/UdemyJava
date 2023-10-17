package udemy.modules.mod8.polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
//        'this' refers to current instance
//        getClass() = java.lang.object -> this returns class type info about RUNTIME INSTANCE on which this method executing
//        from that - get name of class using getSimpleName() method ---- METHOD CHAINING
//        Print out class which will be moving if we execute this method on runtime movie object
//        BUT when implement subclasses + run method, RUNTIME OBJECT could be an instance of one of those classes
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");

//        OUTPUT: e.g. "Star Wars is a Movie film" because RUNTIME INSTANCE of the Movie variable is Movie class.
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

//        Add subclasses on Movies that represent diff genres/classifications - the way streaming companies would group
class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens to bad stuff",
                "Space guys chase Aliens",
                "Planet blows up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}


