package JaGu4Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_1260 {
	
	public static int[][] branch;
	public static boolean[] visit;
	public static Queue<Integer> queue;
	public static int N;
	public static int M;
	public static int V;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		branch = new int[1001][1001];
		visit = new boolean[1001];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			branch[a][b] = branch[b][a] = 1;
		}
		
		dfs(V);
		
		System.out.println(); 
		Arrays.fill(visit, false);
		
		bfs(V);
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
	
	public static void bfs (int start) {
		queue = new LinkedList<Integer>();
		queue.add(start);
		visit[start] = true;
		System.out.print(start + " ");
		  
		while (!queue.isEmpty()) {
			int temp = queue.poll();
			  
			for (int i = 1; i < branch.length; i++) {
				if (branch[temp][i] == 1 && visit[i] == false) {
					queue.add(i);
					visit[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
