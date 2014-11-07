import java.util.*;

class TestQuadEq{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter three coeficents to find the roots: ");
		int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();

		QuadraticEquation obj = new QuadraticEquation(a,b,c);

		double rootOne = obj.getRoot1();
		double rootTwo = obj.getRoot2();

		if (rootOne == 0){
			System.out.println("The equation has no roots.");
		} else{
			System.out.println("Root one: " + rootOne);
			System.out.println("Root two: " + rootTwo);
		}
	}
}
