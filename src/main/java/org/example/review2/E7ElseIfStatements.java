package org.example.review2;

public class E7ElseIfStatements {
    public static void main(String[] args) {

      String day="Sunday";
      if(day.equals("Monday")){
          System.out.println("Work");
      }else if(day.equals("Teusday")){
          System.out.println("Work");
      }else if(day.equals("Wednesday")){
          System.out.println("Leave");
      }else if(day.equals("Thursday")){
          System.out.println("Work");
      }else if(day.equals("Fiday")){
          System.out.println("Movie");
      }else if(day.equals("Saturday")){
          System.out.println("Relax");
      }else if(day.equals("Sunday")){
          System.out.println("Relax");
      }else{
          System.out.println("Wrong day");
      }

    }
}
