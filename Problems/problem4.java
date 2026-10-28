// Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int fact = 1;

        for(int i=1; i <=n; i++){
            fact = fact * i;
            
        }
        System.out.println("factorial of numbers :=" + fact);
        
        
    }
}
