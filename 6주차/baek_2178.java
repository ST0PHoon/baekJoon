package JaGu6Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class baek_2178 {

	public static void main(String[] args) throws IOException {
		// 미로 탐색
		// https://www.acmicpc.net/problem/2178

		solution();
	}
	
	public static void solution() throws IOException {
		// 숫자 받기 & 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<List<String>> nList = new ArrayList<>();
		List<String> numberList;
		
		for (int i = 0; i < N; i++) {
			
			String str = br.readLine();
			
			numberList = Arrays.asList(str.split(""));
			
			nList.add(numberList);
			
		}
		
		// 해법 알고리즘
		
	}
	
	

}
