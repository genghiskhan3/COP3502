import java.util.*;

class ReverseOrder{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String values [] = new String [10];
		String rev [] = new String[10];
		for (int i = 0; i < 10; i++){
			values[i] = in.next();
		}
		for (int i = 0; i < 10; i++){
			String curRev = "";
			int cur = Integer.parseInt(values[i]);
			while(cur > 0){
				int beaver = cur % 10;
				cur /= 10;
				curRev = curRev + beaver;
			}
			rev[i] = curRev;
		}
		for (String s : rev){
			System.out.println(s);
		}
	}
}
