package org.example.review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        we have created a variable int type and calling the nextint() method
        to accept the int type data and storing it in the computer
         */
        System.out.println("Please Enter your Age");
        int age=scan.nextInt();
        if(age>50){
            System.out.println("You will get 20% discount on Toys");
        }else{
            System.out.println("You will get 10% discount");
        }

    }
}
