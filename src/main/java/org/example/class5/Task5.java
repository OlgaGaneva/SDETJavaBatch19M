package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How long do you work");
        int year=scan.nextInt();
        System.out.println("What was your annual salary");
        int salary=scan.nextInt();
        if(year>5){
            if(salary>50000){
                System.out.println("We can offer you a 5000 bonus");
            }else{
                System.out.println("We can offer you a 3000 bonus");
            }
        }else{
            System.out.println("We can't offer you a bonus");
        }


        }
        }

