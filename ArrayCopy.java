import java.util.*;
class ArrayCopy{
	public static void main(String[] args) {
		char [] test = {'a', 'j', '8', '4', 'i', 'n', '9', '+'};

		char newCopy [] = copy(test);
		
		for (char c : newCopy){
			System.out.print(c + " " );
		}
	}

	public static char [] copy(char [] s){
		char [] cur = new char [s.length];
		for (int i = 0; i < s.length; i++){
			cur[i] = s[i];
		}
		return cur;
	}
}
