import java.util.*;

class LabFiveExercise2{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String s = "Java Programming is funny!";

		int aCount = 0;
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A'){
				aCount++;
			}
		}

		System.out.println(s.indexOf("Programming"));

		String inverse = "gnimmargorp";

		System.out.println("\n\nInverse: " + inverse);
		System.out.println("\nComparison Result: " + s.compareTo(inverse));
	}
}
