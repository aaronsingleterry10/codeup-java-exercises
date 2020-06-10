public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;
    public static String shoutDishName(String dish) {
        return dish.toUpperCase();
    }
    public static String analyzeDishCost(int cost) {
        if (cost > AVERAGE_COST_OF_DISH_IN_CENTS) {
            return "More expensive than average";
        } else {
            return "Less expensive than average";
        }
    }
    public static boolean flipRecommendation(boolean recommend) {
        return !recommend;
    }
}
