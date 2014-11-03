import java.util.*;
class MyCalculator{
	public int num1, num2;

	public MyCalculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	// method to do addition
	public int addition(){
		return this.num1 + this.num2;
	}

	// method to do subtraction
	public int subtraction(){
		return this.num1 - this.num2;
	}

	// method to do multiplication
	public int multiplication(){
		return this.num1 * this.num2;
	}

	// method to do division
	public int division(){
		return this.num1 / this.num2;
	}

	// method to find the remainder
	public int remainder(){
		return this.num1 % this.num2;
	}
}
