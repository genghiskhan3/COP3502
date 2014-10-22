import java.util.*;

class MatrixAddition{
	public static void main(String[] args) {
		double [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double [][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

		double [][] result = addMatrices(a, b);

		for (int r = 0; r < a.length; r++){
			for (int c = 0; c < a[0].length; c++){
				System.out.print(result[r][c] + " ");
			}
			System.out.print("\n");
		}
	}

	public static double [][] addMatrices(double[][] x, double [][] y){
		double [][] cur = new double [x.length][x[0].length];

		for (int r = 0; r < cur.length; r++){
			for (int c = 0; c < cur[0].length; c++){
				cur[r][c] = x[r][c] + y[r][c];
			}
		}

		return cur;
	}
}
