package org.example.review3;

import java.util.Scanner;

public class E7LogicalNot {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scan.nextInt();

        if(age!=10 && age!=20 && age!=30){
            System.out.println("You can have a discount");
        }else{
            System.out.println("You can't have a discount");
        }


        }
    }

