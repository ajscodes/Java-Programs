import java.lang.*;
public class SumOfCmdArg{
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Please enter the number.");
        }

        Double sum = 0.0;

        StringBuilder abc = new StringBuilder();
        for(int i=0;i<args.length;i++){
            try {
                Double num = Double.parseDouble(args[i]);
                sum = sum + num;
                abc.append(args[i]);
                if (i < args.length - 1) {
                    abc.append(", ");
                }
            } catch (Exception e) {
                System.out.println("Invalid input: "+args[i]+". Skiping... ");
            }
        }
        System.out.println("Sum of "+abc.toString()+" is "+sum+" .");
    }
}