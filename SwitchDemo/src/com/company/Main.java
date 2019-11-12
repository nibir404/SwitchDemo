package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your digit from 0 to 9 : ");
        System.out.println("Let's see how much lucky you are !!! ");
	    digit =input.nextInt();

	    switch (digit){
            case 1:
                System.out.println("lucky");
                break;
            case 2:
                System.out.println("Super lucky");
                break;
            case 3:
                System.out.println("Bad luck");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Hot");
                break;
            case 6:
                System.out.println("Fuck you");
                break;
            case 7:
                System.out.println("You are Unique");
                break;
            case 8:
                System.out.println("Pay me");
                break;
            case 9:
                System.out.println("L.O.L :3");
                break;
            default:
                if (digit>9){
                    System.out.println("Please try again");
                }
        }

    }
}
