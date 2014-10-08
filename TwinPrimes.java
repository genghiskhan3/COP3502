import java.util.*;

class TwinPrimes{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder string = new StringBuilder();
		for (int i = 3; i < 1000; i++){
			if (isPrime(i)) list.add(i);
		}

		for (int i = 0; i < list.size() - 1; i++){
			if (Math.abs(list.get(i) - list.get(i + 1)) == 2)
				string.append("(" + list.get(i) + ", " + list.get(i + 1) + ")\n");
		}

		System.out.print(string);
	}

	public static boolean isPrime(int n){
		if (n <= 1) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;

		int m =(int) Math.sqrt(n);

		for (int i = 3; i <= m; i += 2){
			if (n % i == 0){
				return false;
			}
		}

		return true;
	}
}
