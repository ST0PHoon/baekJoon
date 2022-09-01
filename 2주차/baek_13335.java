package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baek_13335 {

	static int currentWeight = 0;	// ���� �ٸ��� ����
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �⺻ ����
		StringTokenizer stInfo = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(stInfo.nextToken());	// Ʈ�� ��
		int w = Integer.parseInt(stInfo.nextToken());	// �ٸ� ����
		int L = Integer.parseInt(stInfo.nextToken());	// �ִ� ����
		
		// Ʈ�� ����
		StringTokenizer stTruck = new StringTokenizer(br.readLine());
		
		List<Integer> truckList = new ArrayList<Integer>();
		int[] truckTurn = new int[n];
		
		while (stTruck.hasMoreTokens()) {
			truckList.add(Integer.parseInt(stTruck.nextToken()));
		}

		// ���
		int totalTime = 0; // �ð��� �� �����°�
		int currentTruck = 0;
		
		while (true) {
			totalTime++;
			
			changeWeight(truckTurn, currentTruck, truckList, w);	// �� �� ����
			
			if (weightCheck(truckList.get(currentTruck), L)) {	// Ʈ�� ��� ��Ű��
				truckTurn[currentTruck] = truckTurn[currentTruck] + 1;
				currentWeight = currentWeight + truckList.get(currentTruck);
				currentTruck++;	//���� Ʈ�� �غ�
			} 
			
			// ������ ������ ���������, �ٸ� ���̸�ŭ ���ϰ� ����
			if (currentTruck == n) {
				totalTime += w;
				break;
			}
		}
		
		// ���
		System.out.println(totalTime);
		
	}
	
	// ��� - �ٸ��� �Ѱ踦 �ʰ� ���� Ȯ��.
	public static boolean weightCheck (int nextTruckWeight, int maxWeight) {
		boolean returnType = false;
		
		if (maxWeight >= currentWeight + nextTruckWeight) {
			returnType = true;
		}
		
		return returnType;
	}

	// ��� 2 - Ʈ���� ���� ���� ��(w +1) ���� ����
	public static int[] changeWeight (int[] truckTurn, int currentTruck, List<Integer> truckList, int w) {
		for (int i = 0; i < currentTruck; i++) {
			truckTurn[i] = truckTurn[i] + 1;
			
			if (truckTurn[i] == (w + 1)) {
				currentWeight = currentWeight - truckList.get(i);
			}
		}
		
		return truckTurn;
	}
}
