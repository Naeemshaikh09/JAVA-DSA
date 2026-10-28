import java.util.*;

public class Arithematic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         char symbol = sc.next().charAt(0);
         
         switch (symbol) {
             case '+' : System.out.println(a+b); 
                 break;
                 case '-' : System.out.println(a-b); 
                 break;
                 case '*' : System.out.println(a*b); 
                 break;
                 case '/' : System.out.println(a/b); 
                 break;
             default:
                 System.out.println("this is not arithematic expression");;
         }
    }
}