package Day_1;
import java.io.*;
public class Program_8 {
    public static int reverse(int m) {
        int rev = 0;
        int n = Math.abs(m);
        while(n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num<0){
            System.out.println("Reverse of " + num + " is " + -reverse(num) + ".");
        }
        else {
            System.out.println("Reverse of " + num + " is " + reverse(num) + ".");
        }

    }
}
