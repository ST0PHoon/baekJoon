package JaGu7Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// �� ��� - 10
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int k = getK(N);
		
		StringBuilder sbOneStar = new StringBuilder();
		
		solution(k, 1, sbOneStar.append("*"));
	}
	
	public static int getK(int N) {
		boolean check = true;
		int k = 0;
		
		while (check) {
			N = N/3;
			k++;
			
			if (N == 1) {
				check = false;
			}
		}
		
		return k;
	}
	
	public static void solution(int k, int cyc, StringBuilder star) {
		
		StringBuilder sb = star;
		
		int whenSpatare = (int) Math.pow(3, cyc);
		int spaceNumber = whenSpatare / 3;
		StringBuilder sbSeparator = new StringBuilder();
		StringBuilder sbNonSeparator = new StringBuilder();
		
		// �� �� �׸� ���ΰ�
		for (int i = 0; i < whenSpatare; i++) {
			// �� �ٲ� ��Ģ
			
			
			// ���� �߰� 
		}

			sb.append(System.getProperty("line.separator"));

		
		
		if (k == cyc) {
			System.out.println(sbSeparator); 		
		} else  {
			solution(k, cyc + 1, sbNonSeparator);
		}
	}
	
}
