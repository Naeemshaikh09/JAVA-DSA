import java.util.*;

public class TotalCost {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float pen = sc.nextFloat();
          float pensil = sc.nextFloat();
          float eraser = sc.nextFloat();

          float total = pen + pensil + eraser ;

          System.out.println("you total amount is = " + total );

          float gst = total + (0.18f * total);

          System.out.println("The Added GSt is = " + gst);

   }
}