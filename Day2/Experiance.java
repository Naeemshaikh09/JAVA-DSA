import java.util.*;

public class Experiance {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int experiance= sc.nextInt();

        if(experiance >= 9){
            System.out.println("senior engineer");
        }
        else if(experiance >= 5 && experiance <= 8){
            System.out.println("Software Engineer");
        }
        else if(experiance >= 2 && experiance <= 4){
            System.out.println("Junior Developer");
        }
        else if(experiance > 0 && experiance <= 1){
            System.out.println("Intern");
        }
        else {
            System.out.println("your are not eligible ");
        }
    }
}