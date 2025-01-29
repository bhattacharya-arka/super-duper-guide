package Day_1;
import java.io.*;
public class Program_9 {
    public static int countVowels(String st) {
        int count = 0;
        String str = st.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static int countConsonants(String st) {
        int count = 0;
        String str = st.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Enter the string: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Number of vowels in the string: " + countVowels(str));
        System.out.println("Number of consonants in the string: " + countConsonants(str));

    }
}
