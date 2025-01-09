import java.util.*;
public class LeapYear {
    public static boolean isLeapYear(int num){

        if ((num % 4 ==0) && (num % 100 !=0 || num% 400==0)){
        System.out.println(num + " is a leap year.");
        return true;
    } else {
        System.out.println(num + " is not a leap year.");
        return false;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int num = sc.nextInt();
        isLeapYear(num);
    }        
    
}
