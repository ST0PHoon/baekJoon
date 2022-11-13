package JaGu7Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baek_1337 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 백준 1337 올바른 배열
		int answer = 5;

		ArrayList<Integer> numberList = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			numberList.add(Integer.parseInt(br.readLine()));
		}
		
		// 기능 구현 >> 숫자 1개 선택 후 - 1 
		for (int i = 0; i < numberList.size(); i++) {
			int number = numberList.get(i) - 1;
			int index = 5;
			
			for (int j = 0; j < 5; j++) {
				number++;
				
				if (numberList.contains(number)) {
					index--;
				}
			}
			
			if (answer > index) {
				answer = index;
			}
		}

		System.out.println(answer);
		
	}

}
