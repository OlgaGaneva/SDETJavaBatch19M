package org.example.class5;

import javax.swing.*;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=scan.next();
        if(month.equals("January") || month.equals("February") || month.equals("December")){
            System.out.println("You were born in Winter season");
        }else if(month.equals("March") || month.equals("April") || month.equals("May")){
            System.out.println("You were born in Spring season");
        }else if(month.equals("June") || month.equals("July") || month.equals("August")){
            System.out.println("You were born is Summer season");
        }else if(month.equals("September") || month.equals("October") || month.equals("November")){
            System.out.println("You were born in Autumn season");
        }



        //Write a program for user to enter his/hers birth month.
        // Based on the month define the season
        // Example: if user is born in March, April, May → season =”Spring”
        //if user is born in June, July, August →season =”Summer”  etc …
        //At the end of the program we should see 1 output as
        // “You were born is season ______”.//
    }
}
