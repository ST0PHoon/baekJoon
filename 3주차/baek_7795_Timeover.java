package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_7795_Timeover {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 먹을 것인가 먹힐 것인가
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T =  Integer.parseInt(br.readLine());
		int[] result = new int[T];
		
		for (int i = 0; i < T; i++) {
			StringTokenizer AB = new StringTokenizer( br.readLine());
			
			int N = Integer.parseInt((AB.nextToken()));
			int M = Integer.parseInt((AB.nextToken()));
			
			String[] aList = br.readLine().split(" ");
			
			String[] bList = br.readLine().split(" ");
			
			int answer = 0;
			
			//계산
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (Integer.parseInt(aList[j]) > Integer.parseInt(bList[k])) {
						answer++;
					}
				}
			}
			result[i] = answer;
		}

		for (int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}	
	}
}
