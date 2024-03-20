package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String creditCard=scan.next();
        if(creditCard.equalsIgnoreCase("Yes")){

                System.out.println("What is your balance on the card?");
                int balance=scan.nextInt();
                if(balance>1000){
                    System.out.println("You need to pay immediately");
            }else{
                    System.out.println("You can spend more");
            }
        }else{
            System.out.println("We can offer you a credit card");

        }
        }



    }

