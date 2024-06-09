import java.util.Scanner;
import java.lang.Math;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = radius.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("Area of circle : "+area);
    }
}