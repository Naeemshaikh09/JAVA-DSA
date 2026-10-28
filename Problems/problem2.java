import java.util.*;

public class problem2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         String output = (number % 2 == 0 || number == 0) ? "Even" : "odd";
         System.err.println("output :  " + output);
    }
}