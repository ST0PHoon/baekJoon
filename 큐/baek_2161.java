package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek_2161 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			numberArray.add(i);
		}
		
		if (N > 1) {
			for (int i = 0; i < N; i++) {
				if (numberArray.size() < 3) {
					sb.append(numberArray.get(0));
					sb.append(" ");
					sb.append(numberArray.get(1));
					break;
				}

				sb.append(numberArray.get(0));
				sb.append(" ");

				numberArray.remove(numberArray.get(0));
				numberArray.add(numberArray.get(0));
				numberArray.remove(numberArray.get(0));
			}
		}
		
		if (N == 1) {
			sb.append(numberArray.get(0));
		}
		
		System.out.println(sb);
	}
}
