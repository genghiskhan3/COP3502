import java.util.*;
public class CreditCard {
	public static void main (String [] args){
		long testNumber = 4388576018402626;
	}
	
	// returns true if card is valid
	public static boolean isValid(long number){
		int possibleStarts [] = {4, 5, 37, 6};
		boolean matches = false;
		for (int i = 0; i < 4; i++){
			if(prefixMatched(number, possibleStarts[i])){
				matches = true;
				break;
			}
		}
		if (matches && getSize(number) == 16 && ((sumOfEvenPlaces(number) + sumOfOddPlaces(number)) % 10 == 0)){
			return true;
		}
		
		return false;
	}
	
	// get result from step 2 in the process
	public static int sumOfEvenPlaces(long number){
		String cur = "" + number;
		int sum = 0;
		for (int i = 1; i < 16; i+= 2){
			sum += Integer.parseInt(cur.substring(i, i + 1));
		}
		return sum;
	}
	
	// return the number if it is a single digit otherwise return the sum
	public static int getDigit(int number){
		if (number < 10){
			return number;
		} else{
			return (number % 10) + (number / 10);
		}
	}
	
	// return the sum of the odd place digits
	public static int sumOfOddPlaces(long number){
		int sum = 0;
		String cur = "" + number;
		for (int i = 0; i < 16; i += 2){
			sum += Integer.parseInt(cur.substring(i, i + 1));
		}
		return sum;
	}
	
	// return true if the prefix is valid
	public static boolean prefixMatched(long number, int d){
		String n = "" + d;
		long pre = getPrefix(number, n.length());
		String p = "" + pre;
		if (p.equals(n)){
			return true;
		}
		return false;
	}
	
	// return the number of digits in the series of numbers
	public static int getSize(long number){
		String cur = "" + number;
		return cur.length();
	}
	
	// return the first k number of digits in the numebr
	public static long getPrefix(long number, int k){
		String cur = "" + number;
		String cut = cur.substring(0, k);
		return (long) Integer.parseInt(cut);
	}
}
