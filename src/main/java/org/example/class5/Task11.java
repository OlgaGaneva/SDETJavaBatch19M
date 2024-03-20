package org.example.class5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int score1= scan.nextInt();
        System.out.println("Enter your mid term score");
        int score2=scan.nextInt();
        System.out.println("enter your final score");
        int score3= scan.nextInt();
        int finalScore=(score1+score2+score3)/3;

        if(finalScore>=90){
            System.out.println("grade=A");
        }else if(finalScore>=70 && finalScore<90){
            System.out.println("grade=B");
        }else if(finalScore>=50 && finalScore<70){
            System.out.println("grade=C");
        }else if(finalScore<50){
            System.out.println("grade=F");
        }



      //Write a program that will read three inputs of scores
        // (quiz, mid term, and final scores)
        // and determine the grade based on the following rules:
        //if the average score >=90 → grade=A
        //if the average score >= 70 and <90 → grade=B
        //if the average score>=50 and <70 → grade=C
        //if the average score<50 → grade=F
    }
}
