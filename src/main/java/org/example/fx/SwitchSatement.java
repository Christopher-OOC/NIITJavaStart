package org.example.fx;

import java.util.Scanner;

public class SwitchSatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number from 1 to 5: ");
        int index = scanner.nextInt();

        if (index == 1) {
            System.out.println('A');
        }
        else if (index == 2) {
            System.out.println('B');
        }
        else if (index == 3) {
            System.out.println('C');
        }
        else if (index == 4) {
            System.out.println('D');
        }
        else if (index == 5) {
            System.out.println('E');
        }
        else {
            System.out.println("You must enter either 1 - 5");
        }

//        switch (index) {
//            case 1 : {
//                System.out.println('A');
//                break;
//            }
//            case 2 : {
//                System.out.println('B');
//                break;
//            }
//            case 3 : {
//                System.out.println('C');
//                break;
//            }
//            case 4 : {
//                System.out.println('D');
//                break;
//            }
//            case 5 : {
//                System.out.println('E');
//                break;
//            }
//            default: {
//                System.out.println("You must enter either 1 - 5");
//            }
//        }

         String isBoy = 3 > 2 ? "BOY" : "GIRL";
    }
}
