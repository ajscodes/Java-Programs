import java.util.Scanner;
public class CharToString {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        char ch = 'a';
        
        String str1 = Character.toString(ch);
        System.out.println("Using Character.toString()");

        String str2 = String.valueOf(ch);
        System.out.println("Using String.valueOf()");

        String str3 = ch+"";
        System.out.println("Using ch+\"\"");

        String str4 = new String(new char[]{ch});
        System.out.println("Using new char[]): "+str4); 
    }
}
