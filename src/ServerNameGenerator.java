public class ServerNameGenerator {
    public static String[] adjectives = new String[10];

    public static String[] nouns = new String[10];

    public static String randomElement(String[] array) {
        int randomNumber = (int) (Math.random() * array.length);
        return array[randomNumber];
    }

    public static void main(String[] args) {
        adjectives[0] = "Pretty";
        adjectives[1] = "Sad";
        adjectives[2] = "Happy";
        adjectives[3] = "Curious";
        adjectives[4] = "Super";
        adjectives[5] = "Negative";
        adjectives[6] = "Jolly";
        adjectives[7] = "Crazy";
        adjectives[8] = "Ugly";
        adjectives[9] = "Precious";
        nouns[0] = "Park";
        nouns[1] = "Guitar";
        nouns[2] = "Car";
        nouns[3] = "Airport";
        nouns[4] = "Parking lot";
        nouns[5] = "Dog";
        nouns[6] = "Truck";
        nouns[7] = "Cat";
        nouns[8] = "Bike";
        nouns[9] = "Building";

        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }
}
