public class NumberReversal{
    public static void main(String[] args) {
        int number = 12345, reversed = 0;
        do {
            reversed = reversed * 10 + number % 10;
           number /= 10;
        } while (number != 0);
        System.out.println("Reversed Number: "+ reversed);
    }
}
