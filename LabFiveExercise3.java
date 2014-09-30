import java.util.*;

class LabFiveExercise3{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Enter a letter: ");
		String letter = in.next();

		String [] array = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


		boolean found = false;

		for (int i = 0; i < array.length; i++){
			if (array[i].contains(letter)){
				System.out.println("The corresponding number is: " + i);
				found = true;
			}
		}

		if (!found){
			System.out.println(letter + " is an invalid option");
		}	
	}
}
