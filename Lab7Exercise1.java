import java.util.*;

class Lab7Exercise1{
	public static void main(String[] args) {
		System.out.println(format(34, 4));
	}

	public static String format(int number, int width){
		String num = "" + number;
		String ret = "";
		if (num.length() > width){
			return num;
		} else{
			for (int i = 0; i < (width - num.length()); i++){
				ret = "0" + ret;
			}
		}

		ret = ret + num;
		return ret;
	}
}
