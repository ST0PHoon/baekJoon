package JaGu8Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_8911 {
	
	static int xMax = 0;
	static int xMin = 0;
	static int yMax = 0;
	static int yMin = 0;
	static int xLength = 0;
	static int yLength = 0;

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/8911
		// �ź��� - ����
		
		solution();
	}
	
	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// TestCase = T
		int T = Integer.parseInt(br.readLine());
		
		int[] answerList = new int[T];
		
		for (int i = 0; i < T; i++) {
			int angle = 0;
			
			String[] inputString = br.readLine().split("");
			
			for (int j = 0; j < inputString.length; j++) {
				// ���� ����
				if (inputString[j].equals("L")) {
					angle = angle + 90;
					continue;
				}
				
				if (inputString[j].equals("R")) {
					angle = angle - 90;
					continue;
				}
				
				// ����, ����
				if (inputString[j].equals("F")) {
					xLength += (int) Math.cos(Math.toRadians(angle));
					yLength += (int) Math.sin(Math.toRadians(angle));
				}
				
				if (inputString[j].equals("B")) {
					xLength -= (int) Math.cos(Math.toRadians(angle));
					yLength -= (int) Math.sin(Math.toRadians(angle));
				}	
				
				changeMinMaxLength(xLength, yLength);
			}
			
			// ���� �߰� �� �ʱ�ȭ
			answerList[i] = ( (xMax - xMin) * (yMax - yMin));
			
			xMax = 0;
			xMin = 0;
			yMax = 0;
			yMin = 0;
			xLength = 0;
			yLength = 0;
			
		}
		
		// ��� ���
		for (int i = 0; i < answerList.length; i++) {
			System.out.println(answerList[i]);
		}
		
	}
	
	// �ִ� �ּ� ���� ��ȯ �Լ�
	public static void changeMinMaxLength(int xLength, int yLength) {
		if (xLength > xMax) {
			xMax = xLength;
		} else if (xLength < xMin) {
			xMin = xLength;
		}
		
		if (yLength > yMax) {
			yMax = yLength;
		} else if (yLength < yMin) {
			yMin = yLength;
		}
	}

	
}
