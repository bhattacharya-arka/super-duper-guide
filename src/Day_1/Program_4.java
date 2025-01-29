package Day_1;

import java.io.*;
import java.io.IOException;

public class Program_4 {
    public static int sumofDigits(int m) {
        int sum = 0;
        int n = Math.abs(m);
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("Sum of digits of " + num + " is " + sumofDigits(num) + ".");
    }
}
