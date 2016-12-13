/**
 * Problem: Printing Palindromic Primes
 * "A palindromic prime is a prime number and also palindromic. For example, 131 is a
 * prime and also a palindromic prime. Write a program that that takes in an integer n as
 * input and displays the first n palindromic prime numbers. Display 10 numbers per line
 * and align the numbers properly as shown below. Make sure the display and alignment
 * looks good for up to n=100." from Assignment 1 .pdf
 * EX OUTPUT: 2 3 5 7 11 101 131 151 181 191
 * @author Stephanie Miranda
 * @version 4.0
 */


import java.util.*;

public class PalindromicPrimes 
{
	private static final int MAX = 100;
	private static final int MIN = 1;
	public static int n;
	public static int someNum=0;
	public static int prime;
	public static Scanner number = new Scanner(System.in);
	
	
	public static void main (String[] args)
	{
		PalindromicPrimes palindromic = new PalindromicPrimes(); 
		palindromic.check();
		palindromic.primeList();
	}
	
	/**
	 * This method checks to make sure that the number entered by user is >= 1 and <= 100.
	 */
	public void check()
	{
			
		do {
			System.out.println("Please enter the number of palindromic primes you'd like to see: \t");
			n = number.nextInt();
			if (n < MIN)
				System.out.println("Please enter a natural number greater than or equal to 1.\n");
			else if(n > MAX)
				System.out.println("Please enter a natural number less than or equal to 100.\n");
			else
				System.out.println("These are the first prime numbers up to and not including " + n + ": \t");
				
			}
			while (n < MIN || n > MAX);
		number.close();	
	}
	
	
	/**
	 * This method creates an array to be filled with prime numbers up to the users given number.
	 * 
	 */
	@SuppressWarnings("unused")//item++ in the inner for loop is unused for some reason.
	public void primeList()
	{
		int primeList[] = new int[n];
		prime = primeList.length;
		
		for(int j = 2; j < prime; j++)// j are the items being checked & entered into primeList
			{
				boolean isPrime = true;
				
				
				
				for (int item = 2; item <= someNum++; item++) // this is checking to make sure each item < length of primeList is prime.
					{
						if(j % item == 0 || j % 3 == 0 || j % (int)(Math.sqrt(j)) == 0)
							isPrime = false;
							break;	
					}
			
				if (isPrime == true) // if j, the item, is prime, then check for palindrome.
				{
					
					for(int f = 0; f <= 11 ; f++) //this is the formatting for 10 items per line.
						{
								
							boolean isPalindrome = true;
							do
								{
									int num = j % 10;
									int pal = j * 10 + num;
									int dig = pal / 10;
									//System.out.println("here we are, and this is j: " + j);
									if(j == pal || j == dig)
										isPalindrome = false;
									//System.out.printf(dig + "\t" + pal + "\t");
									if(f % 11 != 0)
										System.out.print(j + "\t");
									else	
										System.out.print("\n" );
									
									//System.out.print(dig + "\t");
									break;
								}
							while(j <= prime);
								
								
						}
						
				}	
								
		}
	}
	
}
