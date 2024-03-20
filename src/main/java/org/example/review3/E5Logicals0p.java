package org.example.review3;

public class E5Logicals0p {
    public static void main(String[] args) {

        /*
        if someone is less than 10 year old or
        someone is older than 50 give a 20$ discount
         */
        int age=10;
        if(age<10 || age>50){
            System.out.println("You will get 20% discount");
        }else{
            System.out.println("No discount");
        }
    }
}
