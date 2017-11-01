/**
 * Name: Peter Tran
 * class: CS 2003
 * date: 10/31/2017
 */
package lab10;
import java.util.ArrayList;


public class Palindrome 
{
	/**
	 * the string is a palindrome when it is empty, its length =1,
	 * or it is the same from left to right as it does from right to left.
	 */
	int max = 9999;
	int min = 1000;
	private boolean isPalindrome(String value )
	{
		int size = value.length();
		if( size == 0 )  // base case, the string has 1 character
			return true;
		else if (value.charAt(0) == value.charAt(size-1))// the 1st and the last of string are the same
			return isPalindrome(value.substring(1, size));// recursive
		else
			return false;
		
	}
			

	/**
	 *  find the product of two 4-digit numbers 
	 *  determine whether it is a palindrome
	 *  put those in an arraylist
	 */
	
	 
	private ArrayList<Integer> getAllValid()
	{
		int product =0;
		ArrayList<Integer> paNumbers = new ArrayList<Integer>();
		for( int i = min; i< max; i++)
		{
			for( int j = min; j< max; j++)
			{
				product = i*j;
				String result  = Integer.toString(product);		
				if(isPalindrome(result))
					 paNumbers.add(product); 
				
			}
		}
		return paNumbers;
	}
	// determine the largest in an array
	
	public int maxProduct( ArrayList<Integer> arr)
	{
		int theMax = arr.get(0);
		for(int i = 0; i< arr.size(); i++)
		{
			if(arr.get(i) > theMax)
				theMax = arr.get(i);
		}
		return theMax;
	}
	// main method
	public static void main(String[] args)
	{   
		Palindrome object1 = new Palindrome();
		int maxVal = object1.maxProduct(object1.getAllValid());
		System.out.println("the largest palindrome number from product of two 4 digit numbers is: " + maxVal);
		
		
	}
}
