public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public int getCostInCents() {
        return this.costInCents;
    }
    public String getNameOfDish() {
        return this.nameOfDish;
    }
    public boolean getWouldRecommend() {
        return this.wouldRecommend;
    }
    public void setCostInCents(int cost) {
        this.costInCents = cost;
    }
    public void setNameOfDish(String dish) {
        this.nameOfDish = dish;
    }
    public void setWouldRecommend(boolean recommend) {
        this.wouldRecommend = recommend;
    }
    public Dish(int cost, String dish, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = dish;
        this.wouldRecommend = recommend;
    }

    public void printSummary() {
        System.out.printf("Cost: %d\nName: %s\nRecommended: %s", costInCents, nameOfDish, wouldRecommend);
    }
}
