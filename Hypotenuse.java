import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
         double x;
         double y;
         double z;

         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Enter the value of X ");
         x = scanner.nextDouble();

         System.out.println("Enter the value of Y ");
         y = scanner.nextDouble();

         z= Math.sqrt((x*x)+(y*y));
         System.out.println("the value of z is "+z);

         scanner.close();
    }

}