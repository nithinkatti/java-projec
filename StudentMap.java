package NEW;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
	public static void main(String[]args) {
		HashMap<Integer,String>StudentMap=new HashMap<>();
		StudentMap.put(100,"raghu");
		StudentMap.put(101,"nithin");
		StudentMap.put(102,"kumar");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number to find name:");
		int roll=sc.nextInt();
		if(StudentMap.containsKey(roll)) {
			System.out.println("Student Name:"+StudentMap.get(roll));
		}
		else
		{
			System.out.println("roll number not found");
			
		
		}
		
	}

}
