package org.example.class5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the current time");
        int hour=scan.nextInt();
        if(hour>=1 && hour<=11){
            System.out.println("It's morning");
        }else if(hour>=11 && hour<=15){
            System.out.println("It's Afternoon");
        }else if(hour>=16 && hour<=20){
            System.out.println("It's evening");
        }else if(hour>=21 && hour<=24){
            System.out.println("It's night");
        }else{
            System.out.println("Invalid");
        }


//Write a program that will ask user to input the current time
// (use 24 hour format).
//Based on the given time define:
//if hour is between 1-11 --> Morning
//if hour between 12-15 --> Afternoon
//if hour between 16-20 --> Evening
//if hour between 21-24 --> Night
//If anything else print invalid
    }
}
