public class CommandLineInput{
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("The command line arguments are: ");
            for(String arg : args){
                System.out.println(arg);
            }
            //String userInput = args[0];
            //and print userInput
        }else{
            System.out.println("No command line arguments provided.");
        }
    }
}