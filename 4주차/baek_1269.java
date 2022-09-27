package JaGu4Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baek_1269 {

	public static void main(String[] args) throws IOException {
		// HashSet
		HashSet<Integer> hashList = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine());
		
		int aLength = Integer.parseInt(st.nextToken());
		int bLength = Integer.parseInt(st.nextToken());
		int totalLength = aLength + bLength;
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			hashList.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			hashList.add(Integer.parseInt(st.nextToken()));
		}
		
		// 계산
		System.out.println(2 * hashList.size() - totalLength);
	}

}
