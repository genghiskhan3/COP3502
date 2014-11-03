import java.util.Scanner;
class MyCalculatorTester{
	public static void main(String[] args)throws Exception{
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter an operator and two integers to operate on: ");
		String line = in.nextLine();
		String [] ar = line.split(" ");
		
		if (ar.length != 3){
			throw new Exception("Sorry but you did not enter the correct input sequence");
		}
		
		char operator = ar[0].charAt(0);
		int numberOne = Integer.parseInt(ar[1]);
		int numberTwo = Integer.parseInt(ar[2]);

		if (operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '%'){
			throw new Exception("Sorry but the operator is not accepted in this calculator");
		}
		
		MyCalculator calculator = new MyCalculator(numberOne, numberTwo);
		
		if (operator == '+'){
			System.out.println(calculator.addition());
		} else if (operator == '-'){
			System.out.println(calculator.subtraction());
		} else if (operator == '*'){
			System.out.println(calculator.multiplication());
		} else if (operator == '/'){
			System.out.println(calculator.division());
		} else{
			System.out.println(calculator.remainder());
		}
		
	}

}
