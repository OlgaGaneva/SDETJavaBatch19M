package org.example.class6;

import java.util.Scanner;

public class E11Loops {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting number");
        int start= scan.nextInt();
        System.out.println("Please enter the ending number");
        int end=scan.nextInt();
        System.out.println("Please enter the step size");
        int step=scan.nextInt();


        while (start<=end){
            System.out.print(start+" ");
            start=start+step;
        }

        }
    }
