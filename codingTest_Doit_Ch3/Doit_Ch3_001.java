package codingTest_Doit_Ch3;

import java.util.Scanner;

public class Doit_Ch3_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		int result = 0;
		
		for(int i = 0; i < number.length(); i++) {
			char value = number.charAt(i);
			//
			result+=value-'0';
		}
		
		System.out.println(result);
	}
	
}
