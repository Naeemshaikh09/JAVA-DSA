import java.util.*;

public class naturalNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sum = 0;
         int i= 1;

         while(i <= n )   // It check the number of N is lessthan i
         {
            sum += i;      // Sum can perform an addition 
            i++;            // ti can increament by 1
         }
         System.out.println("sum is : " + sum);
    }
}