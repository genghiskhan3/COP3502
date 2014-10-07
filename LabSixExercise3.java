import java.util.*;
class LabSixExercise3{
		
	public static int [] memo = new int [1000];	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		System.out.println("The " + input + " fibonnaci sequence number is: " + recurse(input));
	}


	public static int recurse(int n){
		if (n == 0) return memo[0] = 0;
		if (n == 1) return memo[1] = 1;

		if (memo[n] != 0){
			return memo[n];
		}

		return recurse(n - 1) + recurse(n - 2);
	}
}
