import java.util.*;

public class Grade {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();

        if(marks >= 95){
            System.out.println("Grade A++");
        }
        else if(marks >= 90){
            System.out.println("Grade A+");
        }
        else if(marks >= 80 && marks <= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 70 && marks <= 80){
            System.out.println("Grade B");
        }
        else if(marks >= 35){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}