package movies;
import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static String getMovieName(String input) {
        String output = "";
        for (Movie movie: MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(input)) {
                output += movie.getName() + " - " + movie.getCategory() + "\n";
            }
        }
        return output;
    }
    public static String getAllMovies() {
        String output = "";
        for (Movie movie: MoviesArray.findAll()) {
            output += movie.getName() + " - " + movie.getCategory() + "\n";
        }
        return output;
    }

    public static String addNewMovie(Movie[] array, String movieName, String movieGenre) {
        String output = "";
        Movie m = new Movie(movieName, movieGenre);
        Movie[] newMovieArray = Arrays.copyOf(array, array.length + 1);
        newMovieArray[newMovieArray.length - 1] = m;
        for (Movie movie: newMovieArray) {
            output += movie.getName() + " - " + movie.getCategory() + "\n";
        }
        return output;
    }
    public static void main(String[] args) {

        Input userInput = new Input();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello, welcome to our Movies Application! Would you like to continue? y/n");
//        String userInput = scanner.nextLine();
//        if (userInput.equalsIgnoreCase("y")) {
//            System.out.println("Great! What");
//        }
//        System.out.println(MoviesArray.findAll()[0].getCategory());


//        System.out.println(getMovieName(genreInput));
//        for (int i = 0; i < MoviesArray.findAll().length; i++) {
//            if (MoviesArray.findAll()[i].getCategory().equalsIgnoreCase(genreInput)) {
//                System.out.println(MoviesArray.findAll()[i].getName() + "-" + MoviesArray.findAll()[i].getCategory());
//            }
//        }
        System.out.println("Welcome to our Movies Application! What would you like to do?");
        System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category\n" + "6 - add new movie");
        String genreInput = userInput.getString();
        do {
            if (genreInput.equals("0")) {
                System.out.println("Thanks for visiting!");
                break;
            } else if (genreInput.equals("1")) {
                System.out.println(getAllMovies());
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category" + "6 - add new movie");
                genreInput = userInput.getString();
            } else if (genreInput.equals("2")) {
                System.out.println(getMovieName("animated"));
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category" + "6 - add new movie");
                genreInput = userInput.getString();
            } else if (genreInput.equals("3")) {
                System.out.println(getMovieName("drama"));
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category" + "6 - add new movie");
                genreInput = userInput.getString();
            } else if (genreInput.equals("4")) {
                System.out.println(getMovieName("horror"));
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category" + "6 - add new movie");
                genreInput = userInput.getString();
            } else if (genreInput.equals("5")) {
                System.out.println(getMovieName("scifi"));
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category" + "6 - add new movie");
                genreInput = userInput.getString();
            } else if (genreInput.equals("6")) {
                System.out.println("Enter name");
                String name = userInput.getString();
                System.out.println("Enter genre");
                String genre = userInput.getString();
                System.out.println(addNewMovie(MoviesArray.findAll(), name, genre));
                scanner.next();

            } else {
                System.out.println("Invalid response");
                System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n" + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n" + "5 - view movies in the scifi category");
                genreInput = userInput.getString();

            }

        } while (genreInput.length() >= 0);
    }
//    genreInput.equals("0") || genreInput.equals("1") || genreInput.equals("2") || genreInput.equals("3") || genreInput.equals("4") || genreInput.equals("5")
}