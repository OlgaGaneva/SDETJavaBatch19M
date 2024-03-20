package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter you city ");
        String city= scan.next();
        System.out.println("Please enter the temperature in your city");
        double temp=scan.nextDouble();
        double temp2=(temp-32)*5.0/9.0;
        System.out.println("The temperature in the city "+city+" is "+temp2+" C");
    }
}
