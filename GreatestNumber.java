public class GreatestNumber {

    public static int findGreatest(int num1, int num2, int num3) {
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        return greatest;
    }

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 18;
        int number3 = 37;

        int greatestNumber = findGreatest(number1, number2, number3);
        System.out.println("The greatest number is: " + greatestNumber);
    }
}