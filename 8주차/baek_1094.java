package JaGu8Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1094 {
	
	static int[] barList = {64, 32, 16, 8, 4, 2, 1};
	static int answer;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1094
		// ¸·´ë±â 
		
		solution();
		
	}
	
	public static void solution() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputValue = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < barList.length; i++) {
			if (inputValue >= barList[i]) {
				inputValue = inputValue -  barList[i];
				answer++;
			}
			
			if (inputValue == 0) {
				break;
			}
		}
		
		System.out.println(answer);
	}
	
}
