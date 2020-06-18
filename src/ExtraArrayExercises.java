import java.util.Scanner;
public class ExtraArrayExercises {
//    1. Create a command line grocery list maker
//​
//    - before prompting the user to enter each item, ask how many items will be
//            entered
//    - for each item, the user should be prompted to enter in the name, quantity,
//    and category of each grocery item
//    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
//    objects to store in an array
//    - once the user has entered all items, print out all items grouped by
//    category and alphabetized in each group​

    public static void main(String[] args) {
        GroceryItem[] groceryItems;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Welcome to Grocery List Maker.\nHow many grocery items will you be entering?");
        int numItemsEntered = sc.nextInt();
//        System.out.println(numItemsEntered);
        System.out.println("Please enter the name of grocery item:");
        String nameOfGroceryItem = sc.next();
        System.out.println("Please enter the quantity:");
        int quantityOfItem = sc.nextInt();

        System.out.println("Please enter the category of item");
        String categoryOfItem = sc.next();
        groceryItems = new GroceryItem[numItemsEntered];
        System.out.println(nameOfGroceryItem);
        System.out.println(quantityOfItem);
        System.out.println(categoryOfItem);


    }
}
