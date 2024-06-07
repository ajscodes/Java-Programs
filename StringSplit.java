import java.util.Scanner;
public class StringSplit{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Address(Format: City, State): ");
        String address = sc.nextLine();
        // String address = "Vadodara, Gujarat";
        try{
            if(address.endsWith("Gujarat")){
                if(address.contains("Rajkot")){
                    System.out.println("Rangilu " +address.split(",")[0]+ " is detected.");
                }
                else if(address.contains("Vadodara")){
                    System.out.println("Vatovar " +address.split(",")[0]+ " is detected.");
                }
                else{
                    System.out.println("" +address.split(",")[0]+ " is detected.");
                }
                System.out.println("Which is in state"+address.split(",")[1]);
            }
            else{
                System.out.println("Given city is "+address.split(",")[0]+" which is in state"+address.split(",")[1]);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}