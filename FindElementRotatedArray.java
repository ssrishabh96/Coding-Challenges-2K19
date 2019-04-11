// Count the number of times an array is rotated
// Also called given a circularly rotated array

public class FindElementRotatedArray{
	
	private static int array[]=new int[]{11,12,22,34,55,66,122,777,888,9999,9000,1,2,3,4,5,6,6,6,6,6,6,6,6,7,8,9};

	public static void main(String arg[]){

		System.out.println("Key element found at: "+countRotations(122));
	}

	private static int countRotations(int key){

		int low=0, high=array.length-1;
		int result=-1;
		while(high>=low){
			int mid=(low+high)/2;
			// Case 1: if portions between low and high is sorted by default
			if(key==array[mid]) {return mid;}
			// Case 2: right half of the mid is sorted, we disscet the search space
			else if(array[mid]<=array[high]){ 
				if(key>array[mid] && key<=array[high]) 
					low=mid+1;
				else
				 	high=mid-1;
			} else if(array[low]<=array[mid]){
				if(key>=array[low] && key<array[mid])
					high=mid-1;
				else low=mid+1;
			}
			// Case 3: if the left half of the mid is sorted, we disscet the search space
		}


		return -1;
	}
}