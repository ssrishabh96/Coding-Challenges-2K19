// Binary Search program to compute the first and last occurence of an element in an integer array

public class BinarySearch{
	

	private static int array[]=new int[]{1,2,3,4,5,6,6,6,6,6,6,6,6,7,8,9};

	public static void main(String arg[]){

	// Compute the first occurence
	System.out.println("First Occurence of 6:"+firstOccurence(6));
	// Compute the last occurence
	System.out.println("Last Occurence of 6:"+lastOccurence(6));
	}

	// Method that returns the first occurence of a number(if present)
	public static int firstOccurence(int x){
		int low=0;
		int result=-1;
		int high=array.length-1;

		while(high>=low){

			int mid=(low+(high))/2;
			if(array[mid]==x){
				result=mid;
				high=mid-1;
			}else if(array[mid]>x){
				high=mid-1;
			}else{
				low=mid+1;
			}
		} // while-loop ends here
		return result;
	}

	// Method that returns the last occurence of a number(if present)
	public static int lastOccurence(int x){
		int low=0;
		int result=-1;
		int high=array.length-1;

		while(high>=low){

			int mid=(low+(high))/2;

			if(array[mid]==x){
				result=mid;
				low=mid+1;
			}else if(x<array[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
		} // while-loop ends here
		return result;
	}
}