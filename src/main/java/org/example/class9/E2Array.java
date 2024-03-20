package org.example.class9;

public class E2Array {
    public static void main(String[] args) {

        int [] number={10,25,45,66,85,100};

        for (int i = 0; i < number.length; i=i+2) {
            System.out.println(i+" "+number[i]);
        }
    }
}
