package Day_1;
import java.io.*;
public class Program_10 {
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
