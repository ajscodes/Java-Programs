import java.util.Scanner;
public class ConditionChecker {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        // Define the five conditions
        System.out.print("Give answer in true or false.\n");
        System.out.print("Condition-1: ");
        boolean condition1 = op.nextBoolean();
        System.out.print("Condition-2: ");
        boolean condition2 = op.nextBoolean();
        System.out.print("Condition-3: ");
        boolean condition3 = op.nextBoolean();
        System.out.print("Condition-4: ");
        boolean condition4 = op.nextBoolean();
        System.out.print("Condition-5: ");
        boolean condition5 = op.nextBoolean();

        // Check conditions and collect any that are not satisfied
        StringBuilder notSatisfied = new StringBuilder();

        if (!condition1) {
            notSatisfied.append("Condition 1 is not satisfied.\n");
        }
        if (!condition2) {
            notSatisfied.append("Condition 2 is not satisfied.\n");
        }
        if (!condition3) {
            notSatisfied.append("Condition 3 is not satisfied.\n");
        }
        if (!condition4) {
            notSatisfied.append("Condition 4 is not satisfied.\n");
        }
        if (!condition5) {
            notSatisfied.append("Condition 5 is not satisfied.\n");
        }

        // Print the result
        if (notSatisfied.length() == 0) {
            System.out.println("All conditions are satisfied.");
        } else {
            System.out.println("All conditions are not satisfied.");
            System.out.print(notSatisfied.toString());
        }
    }
}
