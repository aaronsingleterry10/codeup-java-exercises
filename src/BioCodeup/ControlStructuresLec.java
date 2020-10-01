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
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);
    }
}
