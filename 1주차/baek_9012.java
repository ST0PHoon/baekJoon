package JaGu1Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받을 개수 지정
		int n = Integer.parseInt(br.readLine());
		String[] resultArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			String[] allBracket = br.readLine().split("");
			int resultInt = 0;
			
			for (int j = 0; j < allBracket.length; j++) {
				String currentBracket = allBracket[j];

				if (currentBracket.equals("(")) {
					resultInt += 1;
				}
				
				if (currentBracket.equals(")")) {
					resultInt -= 1;
				}
				
				// 결과 입력1
				if (resultInt == -1) {
					resultArray[i] = "NO";
					break;
				}
			}
			
			// 결과 입력2
			if (resultInt == 0) {
				resultArray[i] = "YES";
			}
			
			if (resultInt > 0) {
				resultArray[i] = "NO";
			}
			
		}
		// 결과 출력
		for (int i = 0; i < n; i++) {
			System.out.println(resultArray[i]);
		}
	}

}
