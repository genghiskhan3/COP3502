import java.util.*;

class TestDisplayPattern{
	public static void main(String[] args) {
		displayPattern(5);    // you can put any number in here and it will print
							  // the correct pattern
	}

	public static void displayPattern(int n){        // the method to do it
		StringBuilder string = new StringBuilder();
		for (int i = 1; i <= n; i++){
			String cur = "";
			for (int k = i; k > 0; k--){
				cur = cur + "" + k + " ";
			}
			int spacing = n * 2 + (n / 10);
			System.out.printf("%"+(spacing)+"s%n", cur);
		}

		
	}
}
