import java.util.Scanner;
public class performDivisionEx{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first input : ");
        String inp1 = scanner.nextLine();
        
        System.out.println("Enter the second input : ");
        String inp2 = scanner.nextLine();

             performDivisionEx(inp1, inp2);

        scanner.close();
    }
      public static void performDivisionEx(String inp1, String inp2){
        try{

          int a = Integer.parseInt(inp1);
          int b = Integer.parseInt(inp2);

          int result = a/b;
          System.out.println("the result is : " +result);
        }
        catch(NumberFormatException e){
          System.out.println("Enter the Valid Integer");
        } catch(ArithmeticException e){
          System.out.println("Cannot divisible by zero");
        }
    }
}