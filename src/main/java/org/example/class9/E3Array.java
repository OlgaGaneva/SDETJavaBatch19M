package org.example.class9;

public class E3Array {
    public static void main(String[] args) {

        int [] number={10,25,45,66,85,100};

        for (int i = 0; i < number.length; i--) {
        //for (int i = 0; i >=0; i--) to print in a reverse order
        //for (int i =number.length-1; i <=0; i--) option 2
            System.out.println(i+" "+number[i]);
        }
    }
}
