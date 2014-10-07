public class LabSixExercise1{
	public static void main(String[] args) {
		System.out.println("Adding the strings hello and goodbye: " + summation("hello", "goodbye") + "\n\n");
		System.out.println("Adding two ints together ex. 1 and 3: " + summation(1,3));
	}

	public static String summation(String one, String two){
		return one + "" + two;
	}

	public static int summation(int one, int two){
		return one + two;
	}
}
