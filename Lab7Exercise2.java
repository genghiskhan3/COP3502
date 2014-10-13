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

		double area = getArea(values[0], values[1], values[2]);
		if (area == -1.0){
			displayError();
		} else{
			System.out.println(area);
		}
	}

	public static double getArea(double a, double b, double c){
		
		if (validTriangle(a,b,c)){
			double s = (a + b + c) / 2;

			double parameter = s * ((s - a)*(s - b)*(s - c));
			return Math.sqrt(parameter);
		} else{
			return-1.0;
		}
	}

	public static boolean validTriangle(double a, double b, double c){
		double max = 0.0;
		max = Math.max(a, max);
		max = Math.max(b, max);
		max = Math.max(c, max);

		if (max >= ((a + b + c) - max)){
			return false;
		} else{
			return true;
		}
	}

	public static void displayError(){
		System.out.println("Cannot form a triangle");
	}
}
