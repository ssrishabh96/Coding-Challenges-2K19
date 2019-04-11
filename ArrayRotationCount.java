// Count the number of times an array is rotated
// Also called given a circularly rotated array

public class ArrayRotationCount{
	
	private static int array[]=new int[]{11,22,34,55,66,777,888,9999,9000,1,2,3,4,5,6,6,6,6,6,6,6,6,7,8,9};

	public static void main(String arg[]){

		System.out.println("Rotations Count: "+countRotations());
	}

	private static int countRotations(){

		int low=0, high=array.length-1;
		int result=-1;
		while(high>=low){
			int mid=(low+high)/2;
			// Case 1: if portions between low and high is sorted by default
			if(array[low]<=array[high]) {result=low; break;}
			// Case 2: if the current element is the pivot and less than two of its neighbours
			int prev= (mid+high)%high-1;
			int next= (mid+1);
			if(array[mid]<=array[prev] && array[mid]<=array[next]){ result=mid; break; }
			// Case 3: if right half of the mid is sorted, we disscet the search space
			else if(array[mid]<=array[high]){ 
				high=mid-1;
			} else if(array[low]<=array[mid]){
				low=mid+1;
			}
			// Case 4: if the left half of the mid is sorted, we disscet the search space
		}


		return result;
	}
}