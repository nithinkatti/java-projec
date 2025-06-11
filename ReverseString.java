package NEW;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] words=s.split(" ");
       
        
        
        // Reverse the string using a single loop, building the result in a new string
        //String reversed = "";
        for (int i = 0; i<words.length-1; i++) {
        	for(int j=0;j<words.length-1;j++) {
        	//fvvString t=words[i][j];
        	
        	}
        	System.out.print(words[i]+" ");
            
        }
        
       // System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
