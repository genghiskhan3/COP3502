import java.util.*;

class PrintTrigValues{
	public static void main(String[] args) {

		System.out.printf("%-12s%-12s%-12s%n", "Degree", "Sin", "Cos");

		for (int i = 0; i <= 360; i += 10){
			double cos = Math.cos(Math.toRadians(i));
			double sin = Math.sin(Math.toRadians(i));

			System.out.printf("%-12d%-12.4f%-12.4f%n", i, sin, cos);

		}
	}
}
