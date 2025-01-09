import java.io.*;
public class ShowBinary 
{
    public static void main(String[] args) throws IOException
    {
        String readStr;
        int i;
        BufferedReader stdin =
            new BufferedReader(new
              InputStreamReader(System.in));
              System.out.println("Please enter your number");
              readStr = stdin.readLine();
              i=Integer.parseInt(readStr);
              System.out.println("Binary -> " +Integer.toBinaryString(i));     

    }    
}
