package chess;

import java.util.Arrays;

public class CheckInput {

	public static boolean checkCoordinateValidity(String input){
		//return true;
		int len = input.length();
		//char[] FirstChar = {'1','2','3','4','5','6','7','8'};
		//char[] SecChar = {'a','b','c','d','e','f','g','h'};
		if (len == 2){
			//boolean result = Arrays.asList(FirstChar).contains(input.charAt(0));
			char f = input.charAt(0);
			if (f == '1'||f == '2'||f == '3'||f == '4'||f == '5'||f == '6'||f == '7'||f == '8') {
				char s = input.charAt(1);
				if (s == 'a'||s == 'b'||s == 'c'||s == 'd'||s == 'e'||s == 'f'||s == 'g'||s == 'h'){
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}



	}
}
