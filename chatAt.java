public class chatAt {
    public static void main(String[] args) {
        String s= "ABCDEFG\ngffbh";
        char c;
        System.out.println("s= ");
        System.out.println(s);
        c= s.charAt(0);
        System.out.println("charAt(0)="+c);
        c= s.charAt(1);
        System.out.println("charAt(1)="+c);
        System.out.println("The length of this string is");
        System.out.println(s.length()+" characters");
        c=s.charAt(s.length()-1);
        System.out.println("the last char ="+c);
    }
}
