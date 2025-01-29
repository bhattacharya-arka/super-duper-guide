package Day_1;

import java.io.*;

public class Program_5 {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the two numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("Original numbers: a = " + a + ", b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped numbers: a = " + a + ", b = " + b);
    }
}
