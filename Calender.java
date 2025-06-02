package NEW;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = sc.nextLine().toLowerCase();

        switch(day) {
            case "monday":
                System.out.println("Let's learn Java");
                break;
            case "tuesday":
                System.out.println("Let's learn Python");
                break;
            case "wednesday":
                System.out.println("Let's learn SQL");
                break;
            case "thursday":
                System.out.println("Let's learn Angular");
                break;
            case "friday":
                System.out.println("Let's learn C");
                break;
            case "saturday":
                System.out.println("Let's learn C++");
                break;
            case "sunday":
                System.out.println("It's a holiday!");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        sc.close();
    }
}



