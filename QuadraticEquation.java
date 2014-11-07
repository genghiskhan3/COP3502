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
