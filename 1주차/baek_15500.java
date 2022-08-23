package JaGu1Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek_15500 {
	// 데이터 설정
	static ArrayList<String> result = new ArrayList<>();
	static int resultNumber = 0;
	
	public static void main(String[] args) throws IOException {
		// 데이터 설정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		
		
		// 데이터 입력
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while (st.hasMoreTokens()) {
			stack1.push(Integer.parseInt(st.nextToken()));
		}
		
		// 데이터 계산
		for (int i = N; i > 0; i--) {
			
			if (stack1.contains(N)) {
				moveValue(stack1, "1", stack2, "2", N);
			} else {
				moveValue(stack2, "2", stack1, "1", N);
			}
			
		}
		
		// 데이터 출력
		System.out.println(resultNumber);
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i)); 
		}

	}
	
	public static void moveValue(Stack<Integer> st1, String stNum1, Stack<Integer> st2, String stNum2, int searchValue) {
		int i = -1;
		
		while (i != searchValue && i > -1) {
			i = st1.pop();
			
			st2.push(i);
			
			resultNumber++;
			
			result.add(stNum1 + " " + stNum2);
		}
		
		result.add(stNum1 + " 3");
		
		resultNumber++;	
	}

}
