package JaGu4Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_24480 {
	
	static int[][] arr;
	public static int[][] branch;
	public static boolean[] visit;
	static int N;
	static int M;
	static int V;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		while (M --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}

	}
	
	public static void dfs (int start) {
		visit[start] = true;
		System.out.print(start + " ");
		
		for (int i = 1; i <= N; i++) {
			if (branch[start][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
	}

}
