package dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class greedyEx1 {

	public static void main(String[] args) throws IOException {
		// ���� �� + �ݾ� �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int coinType = Integer.parseInt(st.nextToken());
		int totalMoney = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		// ���� ���� �Է�
		Integer[] coinTypeList = new Integer[coinType];
		for (int i = 0; i < coinType; i++) {
			coinTypeList[i] =  Integer.parseInt(br.readLine());
		}
		
		// ���
		Arrays.sort(coinTypeList, Collections.reverseOrder());
		
		for (int i = 0; i < coinTypeList.length; i++) {
			result += totalMoney/coinTypeList[i];
			totalMoney -= (totalMoney/coinTypeList[i]) * coinTypeList[i];
		}
		
		//��� ���
		System.out.println(result);
		
	}

}
