package rcbb;
import java.util.*;

public class Pro {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>tasks=new ArrayList<String>();
		while(true) {
			System.out.println("perform CRUD .operation:");
			System.out.println("1.creating file");
			System.out.println("2.renaming file");
			System.out.println("3.update the file");
			System.out.println("4.delete the file");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("enter the info to create file");
				String task=sc.next();
				System.out.println("filr creation completed");
			}
			else if(choice==2) {
				System.out.println("file rename completed");
			}
			else if(choice==3) {
				System.out.println("update file completed");
			}
			else {
				System.out.println("delected the file");
				break;
				
			}
			
		}
		
		
	}

}
