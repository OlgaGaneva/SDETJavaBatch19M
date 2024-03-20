package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String [] names={"James", "Iram", "Mar Naughty", "Aladin", "Ana", "Silvia"};
        String name="Iram";
        for(String n:names){
            if(n.equals(name)){
                System.out.println("Name is present");
                break;
            }
        }

    }
}
