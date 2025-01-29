package Day_1;
import java.io.*;
public class Program_7 {
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("Fibonacci series upto " + num + " terms is: ");
        for(int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
