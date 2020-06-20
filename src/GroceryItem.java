import java.util.Arrays;

public class GroceryItem {
//    GroceryItem[] groceryItems;
    private String name;
    private String category;
    private int quantity;

    public GroceryItem(String category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String returnList (GroceryItem[] array) {
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
}
