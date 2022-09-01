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
			int M = Integer.parseInt(st.nextToken());	// 어디에 존재하는지
			
			// 케이스별 정보, 중요도
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			
			while (st2.hasMoreTokens()) {
				list.add(Integer.parseInt(st2.nextToken()));
			}
			
			// 계산
			int result = 0;	// 출력할 때, 마다 1 더할 예정
			
			while (true) {	
				if (checkPriority(list, list.get(0))) {	// 자기보다 중요도를 큰 수가 없으면
					if (M == 0) {	// 목표로 하는 수 출력
						result++;
						resultArray[i] = result;
						break;
					}
					// 중요도는 같지만, 목표로하는 수가 아닌 경우
					M--;
					list.remove(0);
					result++;
					
				} else {	// 큰 수가 있으면 뒤로 넘기기
					if (M == 0) {	// 목표로 하는 수
						M = list.size() - 1;
					} else {	// 목표로 하는 수 아니면, 앞으로 한칸
						M--;
					}
					// 뒤로 넘기기
					list = modifyList(list);
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
		// 2번째 값부터 마지막 값까지 자기보다 큰 수 있는지 확인
		for (int i = 1; i < checkList.size(); i++) {
			if (checkNumber < checkList.get(i)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	// 뒤로 넘기기
	public static List<Integer> modifyList(List<Integer> list) {
		list.add(list.get(0));
		
		list.remove(0);
		
		return list;
	}

}
