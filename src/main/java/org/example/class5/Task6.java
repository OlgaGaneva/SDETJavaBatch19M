package org.example.class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the personal heights in inches");
        double height=scan.nextDouble();
        if(height<60){
            System.out.println("You are short");
        }else if(height>72){
            System.out.println("You are tall");
        }else if(height>60 && height<72){
            System.out.println("You are medium");
        }



    }
}
