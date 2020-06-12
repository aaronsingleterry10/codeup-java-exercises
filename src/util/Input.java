package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);


    public boolean yesNo() {
        String response = scanner.nextLine();
        if (response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public boolean getInt(int min, int max) {
        return this.getInt() >= min && this.getInt() <= max;
    }
//

//    public static void main(String[] args) {
//        Input in = new Input();
//        System.out.println("Will you continue? y/n");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);
//    }

}
