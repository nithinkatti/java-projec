package NEW;

import java.util.Scanner; // Import the Scanner class

public class nithi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your age:");
        //System.out.println("Enter your name:");

        int age = sc.nextInt(); 
        sc.nextLine();
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Your age is: " + age); 
        System.out.println("Your name is: " + name);

        sc.close(); // Close the Scanner
    }
}
