package NEW;

import java.util.Scanner;

public class Switchn {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1:");
		int a=sc.nextInt();
		System.out.println("enter the number2:");
		int b=sc.nextInt();
		System.out.println();
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("a+b:"+ (a+b));
				break;
				
			case 2:
				System.out.println("result:"+(a-b));
				break;
			case 3:
				System.out.println("result"+(a*b));
				break;
			case 4:
				if(b==0) {
					System.out.println("0");
				}
				else {
					System.out.println("result:"+(a/b));
				}
				break;
				
			default:
					System.out.println("error");
		}
	}
}
