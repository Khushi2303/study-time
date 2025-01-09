public class StringManipulation {
    public static void main(String[] args) {
        String str= "khushi sikarwar";

        int length= str.length();
        System.out.println("the length of the string is:" +length);

        char character =str.charAt(4);
        System.out.println("character of index 5 is:" +character);

        String substring = str.substring(7);
        System.out.println("Substring starting from index 7: " + substring);

        int index = str.indexOf("khushi");
        System.out.println("index of the 7: " +index);

        String replaced= str.replace("khushi", "sikarwar");
        System.out.println("khushi is replaced by sikarwar: " +replaced);
    }
}