//3.  Prime numbers thorugh both Classic optimized method and Sieve of Eratosthenes method
import java.lang.Math;
public class PrimeNumbers{

	public static void main(String args[]){

		// Compute primes till n=100 or any value
		int n=100;
		// 1. Traditional approach for prime numbers
		primeMethod(n);
		// 2. Sieve of Eratosthenes
		primeSieveMethod(n);
	}

	static void primeMethod(int input){

		System.out.println("\nDivison Method:");

		for(int i=2; i<=input; i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
	}

	static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0) return false;
		}

		return true;
	}

	static void primeSieveMethod(int input){

		int array[]=new int[input+1];
		// 0 indicates not prime, while 1 indicates the number at index is prime
		array[0]=0;
		array[1]=0;
		// Populate the array assuming every other element is prime
		for(int i=2; i<=input; i++){
			array[i]=1;
		}

		// Iterate through the array and check off mulitples of primes
		for(int i=2; i<Math.sqrt(input); i++){
			if(array[i]==1){
				for(int j=2; i*j<=input; j++){
					array[i*j]=0;
				}
			}
		}

		// Print the numbers
		System.out.println("\nSieve of Eratosthenes method:");
		for(int i=0; i<=input; i++){
			if(array[i]==1)
				System.out.print(i+" ");
		}
		System.out.println();
	}

}

