import java.util.*;

class Lab8Exercise3{
	public static void main(String[] args) {
		Random rand = new Random();

		int [] array = new int [10];

		for (int i = 0; i < 10; i++){
			array[i] = rand.nextInt(1001);
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 10; i++){
			min = Math.min(min, array[i]);
			max = Math.max(max, array[i]);
		}

		for (int i : array){
			System.out.println(i);
		}
		System.out.println("The difference between the min and the max is: " +  (max - min));
	}
}
