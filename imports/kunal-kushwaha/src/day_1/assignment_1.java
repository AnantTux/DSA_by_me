package day_1;

import java.util.*;
public class assignment_1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the year: ");
          int year = sc.nextInt();
          if (isLeapYear(year)) System.out.println("Leap Year");
          else System.out.println("Not Leap Year");
     }
     public static boolean isCentury(int year) {
          if (year % 100 == 0) return true;
          else return false;
     }
     public static boolean isLeapYear(int year){
          if (isCentury(year)) {
               if (year % 400 == 0) return true;
               else return false;
          }
          else {
               if (year % 4 == 0) return true;
               else return false;
          }
     }
}
