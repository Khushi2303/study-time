public class Fibonacci{
    public static void main(String[] args) {
         
        int num1=0;
        int num2=1;
        int num3=100;

        for(int i=0; i<100; i++){
            int num4= num1+num2;

            System.out.println(num4);

            num1=num2;
            num2=num4;
        }
    }
}