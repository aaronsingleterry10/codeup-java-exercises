public class DishTest {
    public static void main(String[] args) {
//        Dish d1 = new Dish();
//        d1.costInCents = 9;
//        d1.nameOfDish = "Double Whataburger with cheese";
//        d1.wouldRecommend = true;
//        d1.printSummary();
//        d1.setCostInCents(9);
//        d1.setNameOfDish("Double Whataburger with cheese");
//        d1.setWouldRecommend(true);
//        d1.printSummary();
        Dish d1 = new Dish(14000, "Ultimate Enchiladas", true);
        Dish d2 = new Dish(9000, "Double Whataburger with cheese", true);
        Dish d3 = new Dish(1200, "Crazy Fried Catfish", true);
        Dish d4 = new Dish(15000, "Tofu", false);
        System.out.println(d2.getCostInCents());
        System.out.println(DishTools.shoutDishName(d2.getNameOfDish()));
        System.out.println(DishTools.analyzeDishCost(d4.getCostInCents()));
        System.out.println(DishTools.analyzeDishCost(d2.getCostInCents()));
        System.out.println(DishTools.flipRecommendation(d3.getWouldRecommend()));
        System.out.println(DishTools.flipRecommendation(d4.getWouldRecommend()));
    }
}
