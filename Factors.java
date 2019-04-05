// 4. Finding the factors of a number n
import java.lang.*;
import java.util.ArrayList;

public class Factors{

	public static void main(String args[]){

		// The input number
		int number=99999;

		ArrayList<Integer> list=new ArrayList();
		int array[]=new int[number/2];
		int index=0;

		int temp=(int)Math.sqrt(number);

		for(int i=1; i<=temp; i++){
			if(number%i==0){
				list.add(i);
				if(i!=number/i) {
					array[index]=number/i;
					index++;
				}
			}
		}

		for(int i=index-1;i>=0;i--){
			list.add(array[i]);
		}

		System.out.println("Factors of "+number+" are:");
		for(int x: list){
			System.out.print(x+" ");
		}


	}
}