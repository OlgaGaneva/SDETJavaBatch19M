package org.example.class9;

public class E1Array {
    public static void main(String[] args) {

        int [] number={10,25,45,66,85,100};
        System.out.println(number.length);
        System.out.println(number[3]);
        //System.out.println(number[-5]); not possible
        for (int i = 0; i < number.length; i++) {
            System.out.println(i+" "+number[i]);
        }
    }
}
