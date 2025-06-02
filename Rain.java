package NEW;
import java.util.Scanner;

public class Rain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is it raining? (yes/no): ");
        String input = sc.nextLine().trim().toLowerCase();

        if (input.equals("yes")) {
            System.out.println("Take an Umbrella");
        } else if (input.equals("no")) {
            System.out.println("No need of an Umbrella");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

        sc.close();
    }
}
