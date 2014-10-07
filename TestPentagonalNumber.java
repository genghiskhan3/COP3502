import java.util.*;

class TestPentagonalNumber{
	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();

		int count = 0;
		for (int i = 1; i <= 100; i++){

			int cur = getPentagonalNumber(i);

			if (count < 9){
				string.append(cur + " ");
				count++;
			} else{
				count = 0;
				string.append(cur + " \n");
			}
		}

		System.out.print(string);
	}

	public static int getPentagonalNumber(int n){
		return (n *((3 * n) - 1)) / 2;
	}
}
