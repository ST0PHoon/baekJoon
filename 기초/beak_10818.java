package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beak_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		
		int[] intArr = new int[N];
				
		while(st.hasMoreTokens()) {
			intArr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(intArr);
		System.out.println(intArr[0] + " " + intArr[N-1]);
		
	}

}
