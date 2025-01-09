public class SwapTwoNo {
    public static void main(String[] args) {

        int a = 8;
        int b = 4;

        System.out.println(" --Before Swapping-- " );
        System.out.println("First number: " +a);
        System.out.println("Second number: "+b);

        int temp;
         temp = a;
         a=b;
         b = temp;

        System.out.println(" --After Swapping-- ");
        System.out.println("First NUmber: " +a);
        System.out.println("After Swapping: "+b);

    }
}