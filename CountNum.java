import java.util.*;

class CountNum{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Please enter a series of numbers between one and ten: ");

		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(in.hasNext()){
			nums.add(in.nextInt());
		}

		int occurences [] = new int [11];
		for (int i = 0; i < nums.size(); i++){
			occurences[nums.get(i)]++;
		}

		for(int i = 1; i <= 10; i++){
			int cur = occurences[i];
			if (cur > 1){
				System.out.println(i + " occurs " + cur + " times");
			} else if (cur == 0){
				System.out.println(i + " occurs never");
			} else{
				System.out.println(i + " occurs " + cur + " time");
			}
		}
	}
}
