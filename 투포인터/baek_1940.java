package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek_1940 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 백준 1940, 주몽의 명령, 투포인터
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	//재료개수
		int M = Integer.parseInt(br.readLine());	//고유번호
		int[] list = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		while (st.hasMoreTokens()) {
			list[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		Arrays.sort(list);
		
		int answer = 0;
		int start_index = 0;
		int end_index = 1;
		int sum = 0;
		
		while (start_index != (N-2)) {
			sum = list[start_index] + list[end_index];
			
			if (sum == M) {
				answer++;
				start_index++;
				end_index = start_index + 1;
			} else if (sum > M) {
				start_index++;
				end_index = start_index + 1;
			} else {
				end_index++;
				if (end_index > N-1) {
					start_index++;
					end_index = start_index + 1;
				}
			}
		}
		
		System.out.println(answer);
	}

}
