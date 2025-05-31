package NEW;
import java.util.Scanner;

public class Hash {
public static void main(String[]args) {
	HashSet<String>players=new HashSet<String>();
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Names of 5 Students");

    for (int i = 1; i <= 5; i++) {
        System.out.print("Enter Name of Student"+i+" : ");
        String name = sc.nextLine();
        students.add(name);
    }

    for(String name : students){
        System.out.println(name);
    }

}
}
	
}
}
