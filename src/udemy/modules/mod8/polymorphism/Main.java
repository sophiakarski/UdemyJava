package udemy.modules.mod8.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        We can assign an Adventure object to a Movie variable
//        Method that gets run at runtime determined by the JVM

//        Movie theMovie = new Adventure("Star Wars");

//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type (A for Adventure, C for Comedy, " + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}

