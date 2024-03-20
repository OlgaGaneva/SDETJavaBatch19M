package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You can receive the driver licence");
        }else{
            System.out.println("You can get a lerner permit");
        }
    }
}
