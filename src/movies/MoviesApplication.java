package movies;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
//    public static Movie[] () {
//
//    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello, welcome to our Movies Application! Would you like to continue? y/n");
//        String userInput = scanner.nextLine();
//        if (userInput.equalsIgnoreCase("y")) {
//            System.out.println("Great! What");
//        }
//        System.out.println(MoviesArray.findAll()[0].getCategory());
        System.out.println("Choose genre");
        String genreInput = scanner.nextLine();
        for (Movie movie: MoviesArray.findAll()) {
//            if (movie.getCategory().equalsIgnoreCase("drama")) {
//                System.out.println(movie.getName() + "-" + movie.getCategory());
//            } else if (movie.getCategory().equalsIgnoreCase("musical")) {
//                System.out.println(movie.getName() + "-" + movie.getCategory());
//            } else if (movie.getCategory().equalsIgnoreCase("scifi")) {
//                System.out.println(movie.getName() + "-" + movie.getCategory());
//            }
            if (movie.getCategory().equalsIgnoreCase(genreInput)) {
                System.out.println(movie.getName() + "-" + movie.getCategory());
            } else {
                System.out.println("Sorry, but we don't have any movies of that genre.");
            }
        }
    }
}