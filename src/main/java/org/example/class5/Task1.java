package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount of loan");
        int amount= scan.nextInt();
        if(amount>=200000){
            System.out.println("Your application is approved");
        }else{
            System.out.println("Your request is rejected");
        }

    }
}
