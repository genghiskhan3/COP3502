import java.util.*;

class LabFiveExercise1{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String [] cities = new String [3];

		System.out.println("Enter the first city: ");
		cities[0] = in.next();
		System.out.println("Enter the second city: ");
		cities[1] = in.next();
		System.out.println("Enter the third city: ");
		cities[2] = in.next();

		Arrays.sort(cities);

		System.out.println("The three cities in alphabetical order are " + cities[0]
			 				+ " " + cities[1] + " " + cities[2]);

	}
}
