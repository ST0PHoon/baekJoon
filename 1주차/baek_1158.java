package JaGu1Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_1158 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> table1 = new LinkedList<>();
		Queue<Integer> table2 = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		int checkCycle = 0;	// 0 : table1 에서 값을 꺼냄, 1 : table2에서 값을 꺼냄
		int changeList = 0;
		
		// 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= n; i++) {
			table1.offer(i);
		}
		
		// 계산
		while(!table1.isEmpty() || !table2.isEmpty()) {
			checkCycle++;
			
			if (checkCycle == k) {
				if (changeList == 0) {
					result.add(table1.poll());
				} else {
					result.add(table2.poll());
				}
				
				checkCycle = 0;
				
				if (table1.isEmpty()) {
					changeList = 1;
				}
				
				if (table2.isEmpty()) {
					changeList = 0;
				}
			} else {
				if (changeList == 0) {
					table2.offer(table1.poll());	
				} else {
					table1.offer(table2.poll());	
				}
				
				if (table1.isEmpty()) {
					changeList = 1;
				}
				
				if (table2.isEmpty()) {
					changeList = 0;
				}
			}
			
			if ((table1.size() + table2.size()) == 1) {
				if (table1.isEmpty()) {
					result.add(table2.poll());
				} else {
					result.add(table1.poll());
				}
				
				break;
			}
		}

		// 출력
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
