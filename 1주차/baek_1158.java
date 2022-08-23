package JaGu1Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_1158 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> table = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		// 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			table.add(i);
		}
		
		// 계산
		for (int i = 1; i <= n; i++) {
			
			
//			if () {
//				
//			}
			
			result.add(k * i);
			
		}
		
		
		//출력
		String answer = "<";
		
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				answer += Integer.toString(result.get(i)) + ">";
			} else {
				answer += Integer.toString(result.get(i)) + ", ";
			}
		}
		
		System.out.println(answer);

	}

}
