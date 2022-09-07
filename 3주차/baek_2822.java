package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baek_2822 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> score = new ArrayList<>();
		List<Integer> scoreSort = new ArrayList<>();
		
		int sum = 0;
		List<Integer> location = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			int num = Integer.parseInt(br.readLine());
			score.add(num);
			scoreSort.add(num);	
		}
		
		Collections.sort(scoreSort, Collections.reverseOrder());
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				if (scoreSort.get(i) == score.get(j)) {
					sum += scoreSort.get(i);
					location.add(j + 1);
					break;
				}
			}
		}
		
		Collections.sort(location);
		
		System.out.println(sum);
		for (int i = 0; i < 5; i++) {
			System.out.print(location.get(i) + " ");			
		}
	}

}
