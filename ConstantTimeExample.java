package NEW;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			for(int i=0;i<arr.length;i++) {
			
			
			System.out.println("First Element is:"+arr[i]);
			}
		
		}else{
			System.out.println("Array is empty.");
		}
	}
	public static void main(String[]args) {
		int[]number= {10,20,30,40};
		printFirstElement(number);
	}
}
