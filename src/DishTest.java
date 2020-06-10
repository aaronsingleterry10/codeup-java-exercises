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

        Dish d2 = new Dish(9, "Double Whataburger with cheese", true);
        System.out.println(d2.getCostInCents());
    }
}
