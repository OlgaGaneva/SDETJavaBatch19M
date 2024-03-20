package org.example.class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=scan.nextInt();
        if(number>=1 && number<=20){
            System.out.println("Small number");
        }else if(number>=11 && number<=100){
            System.out.println("Medium number");
        }else if(number>=101 && number<=1000){
            System.out.println("Large number");
        }


//Ask user to enter a number and then categorize if number is small,
// medium or large
//Small number is value between 1 and 10
//Medium number is value between 11 and 100
//Large number is value between 101 and 1000

    }
}
