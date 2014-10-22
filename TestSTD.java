import java.util.*;

class TestSTD{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Please enter 10 digits to find the mean and standard deviation of: ");

		double [] originalNums = new double [10];

		for(int i = 0; i < 10; i++){
			originalNums[i] = (double) in.nextInt();
		}

		System.out.printf("Mean : %f%nDeviation: %f%n", mean(originalNums), deviation(originalNums));

	}

	public static double deviation(double [] x){
		double curMean = mean(x);

		double sum = 0;
		for (Double d : x){
			sum += Math.pow((d - curMean), 2);
		}

		return Math.sqrt((sum / (x.length - 1)));
	}

	public static double mean(double [] x){
		double sum = 0;
		for (Double d : x){
			sum += d;
		}

		return sum / x.length; 
	}
}
