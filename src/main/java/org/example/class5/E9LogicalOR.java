package org.example.class5;

public class E9LogicalOR {
    public static void main(String[] args) {

        boolean flower=false;
        boolean chocolates=false;
        boolean giveCreditCard=true;
        boolean allMyMistake=true;

        if(flower|| chocolates|| giveCreditCard||allMyMistake){
            System.out.println("Wife is Happy");
        }else{
            System.out.println("Wife is Sad");
        }
    }
}
