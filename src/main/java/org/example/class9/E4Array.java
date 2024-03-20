package org.example.class9;

public class E4Array {
    public static void main(String[] args) {

        int [] number={10,25,45,66,85,100};
        int sum=0;
        for(int i=0; i< number.length; i++){
            sum=sum+number[i];

        }
        System.out.println(sum/ number.length);
    }
}
