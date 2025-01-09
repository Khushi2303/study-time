public class problem4 {
    public static void main(String[] args) {
        double a=6.5, b=3.7;
        double inner = -(Math.pow(a ,2)) + (Math.pow(b , 2));
        double result = Math.exp(Math.sqrt(inner));
        System.out.println(result);
    }
    
}
//result = Math.exp(Math.sqrt(inner)):
//Math.exp(Double.NaN) will typically result in Double.NaN as well. The exp function cannot operate on a non-numeric value.
//Therefore, the output of the code will be **NaN**, indicating an error or undefined result due to the imaginary number under the square root.
