import java.util.Arrays;
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

    static String returnList (GroceryItem[] array) {
        String[] newList = new String[array.length];
        String list = "";
        for (int i = 0; i < array.length; i++) {
            newList[i] = "Category: " + array[i].getCategory() + ". Name of item: " + array[i].getName() + ". Quantity: " + array[i].getQuantity() + ". ";
        }
        Arrays.sort(newList);
        for (int i = 0; i < newList.length; i++) {
            if (i != newList.length - 1) {
                list += newList[i] + "\n==================\n";
            } else {
                list += newList[i];
            }
        }
        return list;
    }

    static void groceryListMaker(GroceryItem[] array, int numberOfItems) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the name of grocery item #" + (i + 1) + ":");
            String nameOfGroceryItem = sc.next();

            System.out.println("Please enter the quantity:");
            int quantityOfItem = sc.nextInt();

            System.out.println("Please enter the category of item");
            String categoryOfItem = sc.next();
            array[i] = new GroceryItem(categoryOfItem, nameOfGroceryItem, quantityOfItem);
        }
    }

    public static void main(String[] args) {

        GroceryItem[] groceryItems;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grocery List Maker.\nHow many grocery items will you be entering?");
        int numItemsEntered = sc.nextInt();
        groceryItems = new GroceryItem[numItemsEntered];

//      this method creates the grocery list
        groceryListMaker(groceryItems, numItemsEntered);

//      this method takes the grocery list and sorts the list alphabetically by category
        System.out.println(returnList(groceryItems));
    }
}
