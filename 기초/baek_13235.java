package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_13235 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		String word = sb.toString();
		String reverseWord = sb.reverse().toString();
		
		boolean result;
		
		if(reverseWord.equals(word)) {
			result = true;
		} else {
			result = false;
		}
		
		System.out.println(result);
	}

}
