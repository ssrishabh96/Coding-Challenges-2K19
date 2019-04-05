// 5. Prime Factorization of a number

import java.lang.*;

public class PrimeFactors{
	
	public static void main(String args[]){

	int input=9713;

	for(int i=2; i<=100; i++){

		if(input%i==0){
			int count=0;
			while(input%i==0){
				input=input/i;
				count++;
			}
			System.out.println(i+": "+count);
		}
	}
	if(input!=1){
		System.out.println(input+": 1");
	}


	}
}
