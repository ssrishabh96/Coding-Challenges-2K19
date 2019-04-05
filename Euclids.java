// 6. Euclid's algorithm to find the Greatest Common Divisor (GCD) of two numbers

import java.lang.*;

public class Euclids{
	public static void main(String args[]){

	int a=449, b=7;
	System.out.println("GCD is: "+computeGCD(a,b));
	}

	private static int computeGCD(int a, int b){

		if(a<=0 ||b<=0 ) return 0;

		int divisor = a>=b?a:b;
		int dividend= a<=b?a:b;
		int remainder=0;

		while(divisor!=0){
			remainder=dividend % divisor;
			dividend=divisor;
			divisor=remainder;


		}

		return dividend;

	}
}