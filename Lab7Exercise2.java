import java.util.*;

class Lab7Exercise2{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Please enter three sides of a triangle: ");
		String line = in.nextLine();
		String array [] = line.split(" ");
		double values [] = new double[3];
		for (int i = 0; i < array.length; i++){
			values[i] = (double)Integer.parseInt(array[i]);
		}

		System.out.println(getArea(values[0], values[1], values[2]));
	}

	public static double getArea(double a, double b, double c){
		double s = (a + b + c) / 2;

		double parameter = s * ((s - a)*(s - b)*(s - c));
		return Math.sqrt(parameter);
	}
}
