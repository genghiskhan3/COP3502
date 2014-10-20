import java.util.*;
class CreditCard {
	public static void main (String [] args){
		//User enters a value for a credit card number
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a credit card number to determine if it is valid: ");
		
		String testNumber = in.next();   // have to use a string because value is to big to be a long

		if(isValid(testNumber)){
			System.out.println("You have a valid credit card number");
		} else{
			System.out.println("Sorry your credit card number is invalid");
		}
	}
	
	// returns true if card is valid
	public static boolean isValid(String number){
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
	public static int sumOfEvenPlaces(String number){
		String cur = number;
		int sum = 0;
		for (int i = 0; i < 16; i+= 2){
			int val = Integer.parseInt(cur.substring(i, i + 1));
			sum += getDigit(val);
		}
		return sum;
	}
	
	// return the number if it is a single digit otherwise return the sum
	public static int getDigit(int number){
		number *= 2;
		if (number < 10){
			return number;
		} else{
			return (number % 10) + (number / 10);
		}
	}
	
	// return the sum of the odd place digits
	public static int sumOfOddPlaces(String number){
		int sum = 0;
		String cur = number;
		for (int i = 1; i < 16; i += 2){
			sum += Integer.parseInt(cur.substring(i, i + 1));
		}
		return sum;
	}
	
	// return true if the prefix is valid
	public static boolean prefixMatched(String number, int d){
		String n = "" + d;
		String pre = getPrefix(number, n.length());
		if (pre.equals(n)){
			return true;
		}
		return false;
	}
	
	// return the number of digits in the series of numbers
	public static int getSize(String number){
		String cur = "" + number;
		return cur.length();
	}
	
	// return the first k number of digits in the numebr
	public static String getPrefix(String number, int k){
		String cur = "" + number;
		String cut = cur.substring(0, k);
		return cut;
	}
}
