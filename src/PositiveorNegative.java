/*
 Write a program to ask the user for a number and determine whether it is a positive number,
 a negative number or zero.
  */

import java.util.Scanner;
public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num == 0 ) {
            System.out.println("Number is  Zero");
        } else if (num > 0 ) {
            System.out.println("Number is positive");
        } else
            System.out.println("Number is negative");
        }
    }
