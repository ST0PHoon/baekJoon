package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_3052 {

	public static void main(String[] args) throws IOException {
		// น้มุ 3052
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> remainList = new ArrayList<Integer>();
		ArrayList<Integer> remainListNoDuplicate = new ArrayList<Integer>();
		int answer = 0;
		
		for (int i = 0; i < 10; i++) {
			remainList.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		for (int number : remainList) {
			if(!remainListNoDuplicate.contains(number)) {
				remainListNoDuplicate.add(number);
			}
		}
		
		answer = remainListNoDuplicate.size();
		
		System.out.println(answer);
	}

}
