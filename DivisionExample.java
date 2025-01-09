import java.util.*;

public class DivisionExample{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        String inp1 = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String inp2 = scanner.nextLine();

        performDivision(inp1, inp2);

    scanner.close();
    }
    public static void performDivision(String inp1 , String inp2 ){
    try{
        int numerator = Integer.parseInt(inp1);
        int denominator = Integer.parseInt(inp2);

        int result = numerator/ denominator;
        System.out.println("Result: "+result);
    }
    catch(ArithmeticException e){
        System.out.println("ERROR: Division by ZERO is not allowed.");
    }
    catch(NumberFormatException e){
        System.out.println("ERROR: Please enter a valid INTEGER.");
    }
    catch(Exception e){ 
        System.out.println("ERROR: An unexpected error occured. "+e.getMessage());
    }
}

}
