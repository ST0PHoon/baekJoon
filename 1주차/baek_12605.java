package JaGu1Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek_12605 {

	public static void main(String[] args) throws IOException {
		// 선입후출, 후입선출
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받을 개수 지정
		int n = Integer.parseInt(br.readLine());
		// 결과 담아둘 배열 생성
		String[] result = new String[n];
		
		// n개 만큼 입력 받기
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Stack<String> caseStr = new Stack<>();
			int stringLength = 0;
			String resultStr = "";
			
			// 입력
			while(st.hasMoreTokens()) {
				caseStr.push(st.nextToken());
				stringLength++;
			}
			// 결과 입력
			for (int j = 0; j < stringLength; j++) {
				resultStr += caseStr.pop() + " ";
			}
			
			result[i] = resultStr.trim();
		}
		
		// 결과 출력
		for (int i = 0; i < n; i++) {
			System.out.println("Case #" + (i + 1) + ": " + result[i]);
		}
		
	}
}
