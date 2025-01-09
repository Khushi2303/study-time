public class concat {
    public static void main(String[] args) {
        String s1=" khushi";
        String s2=" sikarwar";
        String s3 , s4;

        s3=s1.concat(s2);
        s4= s2.concat(s1);
        System.out.println("s3 is " +s3);
        System.out.println("s4 is " +s4);

        String s5= "khushi".concat(" singh").concat(" sikarwar");
        System.out.println(s5);

    }
}
