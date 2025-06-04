package NEW;

public class LinearSearchExample {
	public static void main(String[]args) {
		int[]numbers= {1,2,3,4,5,6};
		int target=9;
		boolean f=false;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==target) {
			System.out.println("found"+target+"at index"+i);
			f=true;
			break;
			
			
		}
			
			
		}
		if(!f){
			System.out.println("no element is present");
		}
	}
}
