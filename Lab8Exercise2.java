import java.util.*;

class Lab8Exercise2{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a phrase to be reversed: ");
		String phrase = in.nextLine();

		String rev = "";

		for (int i = phrase.length() - 1; i >= 0; i--){
			String add = "" + phrase.charAt(i);
			rev = rev + add; 
		}

		System.out.println(rev);
	}
}
