package Day_1;
import java.io.*;
public class Program_3 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
