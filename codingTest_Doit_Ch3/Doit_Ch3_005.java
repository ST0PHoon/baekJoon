package codingTest_Doit_Ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Doit_Ch3_005 {

	public static void main(String[] args) throws IOException {
		// น้มุ 10986
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int sum = 0;
		int[] count = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sum = (sum + Integer.parseInt(st.nextToken())) % M;
			count[sum]++;
		}

		long ans = count[0];
		
		for (int i = 0; i < M; i++) {
			ans += (long) count[i] * (count[i] - 1) / 2;
		}
		
		System.out.println(ans);
	}
}