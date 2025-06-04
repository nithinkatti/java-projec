package NEW;

public class Binary {
	public static void main(String[]args) {
		int[]numbers= {2,3,5,6,7,7,8};
		int target=8;
		int left=0;
		int right=numbers.length-1;
		boolean found=false;
		while(left<=right) {
			int mid=(left+right)/2;
			if(numbers[mid]==target) {
				System.out.println("found"+target+"at index"+mid);
				found=true;
				break;
			}
			else if(target<numbers[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
	}

}
