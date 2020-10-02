package BioCodeup;

public class ControlStructuresLec {
    public static void main(String[] args) {
        System.out.println("Control Structures Lecture");
        int operatorId = 8922;
        int operatorAge = 16;

        boolean isSignedIn = operatorId == 8922;

//        System.out.println("isSignedIn = " + isSignedIn);

        // Exercise 1 - Loop Basics

        // While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // Do While Loop
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);
//        long l = 2;
//        do {
//            System.out.println(l);
//            l *= l;
//        } while (l < 1000000);

        // For Loop

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
