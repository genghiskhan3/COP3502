import java.util.*

class QuadraticEquation{
	private int a, b, c;

	public QuadraticEquation(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getter for a
	public int getA(){
		return this.a;
	}
	// getter for b
	public int getB(){
		return this.b;
	}
	// getter for c
	public int getC(){
		return this.c;
	}

	// method to get the discriminant
	public int getDiscriminant(){
		return ((int)Math.pow(getB(), 2)) - (4 * getA() * getC());
	}

	// find the first root
	public double getRoot1(){
		if (getDiscriminant() < 0){
			return 0.0;
		} else{
			return Math.sqrt(getDiscriminant());
		}
	}

	// find the second root
	public double getRoot2(){
		if (getDiscriminant() < 0){
			return 0.0;
		} else{
			return (Math.sqrt(getDiscriminant())) * -1;
		}
	}
}

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
