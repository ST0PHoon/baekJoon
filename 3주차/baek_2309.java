package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baek_2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 키를 담을 List, 키의 합  sum 선언
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		int peopleNum = 9;
		
		// 키를 입력받으면서 키의 총합 구하기
		for (int i =0; i < peopleNum; i++) {
			int currentNumber = Integer.parseInt(br.readLine());
			list.add(currentNumber);
			sum += currentNumber;
		}
		
		// 총 키에서 100을 빼서 빼야하는 키 구하기
		int dif = sum - 100;
		// 정렬
		Collections.sort(list);
		
		// 빼야하는 두 키를 찾을 경우 뺀다. 
		for (int i = 0; i < peopleNum; i ++) {
			int currentNumber = list.get(i);
			int findNumber = dif - currentNumber;
			
			if (list.contains(findNumber)) {
				list.remove(Integer.valueOf(currentNumber));
				list.remove(Integer.valueOf(findNumber));
				break;
			}
		}
		
		// 출력
		for (int i = 0; i < 7; i++) {
			System.out.println(list.get(i));
		}
	}

}
