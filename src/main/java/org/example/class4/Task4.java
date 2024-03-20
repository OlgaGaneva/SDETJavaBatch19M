package org.example.class4;

public class Task4 {
    public static void main(String[] args) {
        boolean degree = true;
        double gpa = 3.8;
        if(degree){
            if(degree==true){
                System.out.println("Congratulations");

            }else if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should have a degree");
        }

    }
}
