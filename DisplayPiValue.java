import java.util.*;

class DisplayPiValue{
	public static void main(String[] args) {
		System.out.printf("i%20s%n", "m(i)");
		System.out.printf("10%20.5f%n", piValue(10));
		System.out.printf("20%20.5f%n", piValue(20));
		System.out.printf("50%20.5f%n", piValue(50));
		System.out.printf("100%19.5f%n", piValue(100));
		System.out.printf("1000%18.5f%n", piValue(1000));
	}

	public static double piValue(int m){
		double cur = 0;
		double [] values = new double[m + 1];

		int count = 0;
		for (int i = 1; i <= ((2 * m) + 1); i += 2){
			if (count % 2 == 0){
				values[count] =(double) 1/(double)i;
				count++;
			} else{
				values[count] = ((1.0/ (double) i)) * -1;
				count++;
			}
		}

		for (double d : values){
			cur += d;
		}

		return 4.0 * cur;
	}
}
