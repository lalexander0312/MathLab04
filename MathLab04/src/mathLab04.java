
// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;


 
public class mathLab04{


	public static void main(String args[]) 
	{
		// This main method needs additions for the 100 point version.
		DecimalFormat thousands = new DecimalFormat("0000");
		
		Scanner input = new Scanner(System.in); 
		System.out.println("\nMathLab04\n");
		System.out.println("Please enter a limit");
		
		final int max = input.nextInt();
		boolean primes[];
		primes = new boolean[max];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		primes[0]= false;
		primes[1] = false;
		primes [2] = true;
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		
		for(int k = 0; k < primes.length; k++){
				primes[k]= true;
		}
		
		for(int y = 2; y< primes.length; y++){
			if(primes[y]== true){
				for(int g = y*2; g< primes.length; g+=y){
					primes[g]= false;
				}
			}
			
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for(int d = 2; d<primes.length; d++){
			if(primes[d]==true){
				System.out.print(d + " ");
			}
		}
		
		System.out.println();
				
	}
	
}



