package NEW;
import java.io.*;
import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter a number");
		if(a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}
}