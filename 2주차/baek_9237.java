package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class baek_9237 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> treeList = new ArrayList<>(); 
		int maxDay = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while (st.hasMoreTokens()) {
			treeList.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(treeList, Collections.reverseOrder());
		
		for (int i = 1; i <= N; i++) {
			int growDay = i + treeList.get(i-1) + 1;
			if (maxDay < growDay) {
				maxDay = growDay;
			}
		}
		
		System.out.println(maxDay);
	}

}
