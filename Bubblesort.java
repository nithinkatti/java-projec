package NEW;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[]args) {
		int[]numbers= {5,6,8,9,2};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted List");
		for(int num:numbers) {
			System.out.println(num+" ");
			
		}
		System.out.println(Arrays.toString(numbers));
	}

}

