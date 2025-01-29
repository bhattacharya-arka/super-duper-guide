package Day_1;
import java.io.*;
public class Program_2 {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Hello " + name + "!");
    }
}
