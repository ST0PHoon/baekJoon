package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 백준 2018, 투포인터
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while (end_index != N) {
			if (sum == N) {
				count++;
				end_index++;
				sum = sum + end_index;
			} else if (sum > N) {
				sum = sum - start_index;
				start_index++;
			} else {
				end_index++;
				sum = sum + end_index;
			}
		}
		
		System.out.println(count);
		
	}

}
