package org.example.class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the grade");
        char grade=scan.next().charAt(0);
        //scan.next().toLowerCase().charAt(0); in this case lower case are used

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Average");
                break;
            case 'D':
            case 'd':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}
//Allow user to enter grade (A, B, or C etc...) and
//then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
//any other grade --> Not Acceptable. At the end your program should
//print which grade was entered by a user with explanation.
