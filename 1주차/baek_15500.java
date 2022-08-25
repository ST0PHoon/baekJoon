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
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	
	public static void main(String[] args) throws IOException {
		// 데이터 설정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		// 데이터 입력
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while (st.hasMoreTokens()) {
			stack1.push(Integer.parseInt(st.nextToken()));
		}
		
		// 데이터 계산
		for (int i = N; i > 0; i--) {
			
			if (stack1.contains(i)) {
				moveValue1("1", "2", i);	
			} else {
				moveValue2("2","1", i);
			}
			
		}
		
		// 데이터 출력
		System.out.println(result.size());
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i)); 
		}

	}
	
	public static void moveValue1( String stNum1, String stNum2, int searchValue) {
		int i = stack1.peek();
		
		while (i != searchValue && i > -1) {
			stack2.push(i);
			
			stack1.pop();
			
			i = stack1.peek();
			
			result.add(stNum1 + " " + stNum2);
		}
		
		if(searchValue == i) {
			stack1.pop();
			
			result.add(stNum1 + " 3");		
		}	
		
	}
	
	public static void moveValue2( String stNum1, String stNum2, int searchValue) {
		int i = stack2.peek();
		
		while (i != searchValue && i > -1) {
			stack1.push(i);
			
			stack2.pop();
			
			i = stack2.peek();
			
			result.add(stNum1 + " " + stNum2);
		}
		
		if(searchValue == i) {
			stack2.pop();
			
			result.add(stNum1 + " 3");		
		}
			
		
	}

}
