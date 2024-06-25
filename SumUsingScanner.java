
import java.util.Scanner;

public class SumUsingScanner {
    public static void main(String []args){
        Scanner abc = new Scanner(System.in);
        System.out.print("How many numbers are you want to use in addition? : ");
        int count = abc.nextInt();

        int sum = 0;
        for(int i=1;i<=count;i++){
            System.out.print("Enter the num "+i+": ");
            int num = abc.nextInt();
            sum =  sum+num;
        }
        System.out.println("Sum of the numbers is: " + sum);
        abc.close();
    }
}
