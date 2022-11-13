package JaGu8Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek_1012 {
	static int answer;
	static int M, N, K;
	static boolean[][] visit;
	static int[][] area;
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1012
		// 유기농 배추 - 깊이 탐색
		
		solution();

	}

	public static void solution() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// testCase = T
		int T = Integer.parseInt(br.readLine());
		int[] answerList = new int[T];
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			answer = 0;
			
			// M 가로, N 세로, K 배추 수
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			visit = new boolean[M][N];
			area = new int[M][N];
			
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				area[x][y] = 1;
			}
			
			
			for (int row = 0; row < M; row++) { 
				for (int col = 0; col < N; col++) {
					if(area[row][col] == 1 && !visit[row][col]) {

						dfs(row, col);
						
						answer++;
					}
					
				}
			}
			
			answerList[i] = answer;
			
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(answerList[i]);
		}
		
	}
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int xindex = x + dx[i];
			int yindex = y + dy[i];
			
			if ((xindex >= 0 && xindex < M) && (yindex >= 0 && yindex < N)) {
				if (!visit[xindex][yindex] && area[xindex][yindex] == 1) {
					
					dfs(xindex, yindex);
				}
			}
		}
	}
	
}
