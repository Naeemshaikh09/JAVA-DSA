import java.util.*;

public class problem1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         if(number > 0){
            System.err.println("number is positive");
         }
         else if( number < 0){
            System.err.println("number is negative");
         }
         else {
            System.err.println("number is zero");
         }
    }
}

//Given an integer, determine whether the number is positive, negative, or zero.