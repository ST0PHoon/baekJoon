package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baek_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int[] resultArray = new int[K];
		
		for (int i = 0; i < K; i++) {
			// 케이스별 정보, 기본정보
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());		// 몇개를 받을지
			int M = Integer.parseInt(st.nextToken()) + 1;	// 어디에 존재하는지
			
			// 케이스별 정보, 중요도
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			
			while (st2.hasMoreTokens()) {
				list.add(Integer.parseInt(st2.nextToken()));
			}
			
			// 계산
			int result = 0;
			int aimNumber = list.get(M - 1);
			
			while (result != 10) {
				result++;
				
				int listSize = list.size();
				
				if (checkPriority(list, list.get(listSize - 1))) {	// 자기보다 중요도를 큰 수가 없으면
					if (M == listSize) {
						resultArray[i] = result;
						break;
					}
					
					if (aimNumber == list.get(listSize - 1)) {
						M++;
						list = modifyList(list, listSize);
					} else {
						list.remove(listSize - 1);
					}
					
				} else {	// 있으면 넘기기 함수 실행

					if (M == listSize) {
						M = 1;
					} else {
						M++;
					}
					
					list = modifyList(list, listSize);
				}	
			}
		}
		
		// 출력
		for (int i = 0; i < K; i++) {
			System.out.println(resultArray[i]);
		}

	}
	
	// 증요도 판별
	public static boolean checkPriority(List<Integer> checkList, int checkNumber) {
		boolean result = true;
		
		for (int i = 0; i < checkList.size() - 1; i++) {
			if (checkNumber < checkList.get(i)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	// 뒤로 넘기기
	public static List<Integer> modifyList(List<Integer> list, int numberLocation) {
		
		list.add(0, list.get(numberLocation - 1));
		
		list.remove(list.size() - 1);
		
		return list;
		
	}

}
