package Day_1;
import java.io.*;
public class Program_6 {
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num<0){
            System.out.println("Factorial of negative number is not possible.");
            System.exit(0);
        }
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
