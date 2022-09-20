package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class baek_7795 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T  = Integer.parseInt(br.readLine());
		ArrayList<Integer> resultList = new ArrayList<>(); 
		
		for (int i = 0; i < T; i++) {
			// A B 몇개 받을지 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// A B 값 입력 받기
			StringTokenizer stA = new StringTokenizer(br.readLine());
			StringTokenizer stB = new StringTokenizer(br.readLine());
			
			// 배열에 넣고 정렬
			ArrayList<Integer> listA = new ArrayList<>();
			while (stA.hasMoreTokens()) {
				listA.add(Integer.parseInt(stA.nextToken()));
			}
			
			ArrayList<Integer> listB = new ArrayList<>();
			while (stB.hasMoreTokens()) {
				listB.add(Integer.parseInt(stB.nextToken()));
			}
			
			Collections.sort(listA);
			Collections.sort(listB);
			
			// 계산 투 포인터
			int aPointer = 0;
			int bPointer = 0;
			int result = 0;
			
			while (aPointer != N) {
				if(bPointer >= M) {
					bPointer = 0;
					aPointer++;
				}
				
				if (aPointer >= N) {
					break;
				}
				
				if (listA.get(aPointer) > listB.get(bPointer)) {
					result++;
					bPointer++;
				} else {
					bPointer = 0;
					aPointer++;
				}
			}
			
			resultList.add(result);
			
		}
		
		for (Integer result : resultList) {
			System.out.println(result);
		}

	}

}
