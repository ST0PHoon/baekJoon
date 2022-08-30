package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek_13335 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �⺻ ����
		StringTokenizer stInfo = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(stInfo.nextToken());	// Ʈ�� ��
		int w = Integer.parseInt(stInfo.nextToken());	// �ٸ� ����
		int L = Integer.parseInt(stInfo.nextToken());	// �ִ� ����
		
		// Ʈ�� ����
		StringTokenizer stTruck = new StringTokenizer(br.readLine());
		
		Queue<Integer> truckList = new LinkedList<>();
		
		while (stTruck.hasMoreTokens()) {
			truckList.offer(Integer.parseInt(stTruck.nextToken()));
		}
		
		// ���
		int currentWeight = 0;	// ���� �ٸ��� ����
		int totalTime = 0; // �ð��� �� �����°�
		
		while (currentWeight != 0 && !truckList.isEmpty()) {	// �ٸ��� ���� = 0, Ʈ������Ʈ�� 0 �� �� ����
			totalTime++;
			
			if (weightCheck(currentWeight, truckList.peek(), L)) {	// ���� ���ϱ�
				
			} else {	// �׳� ����
				continue;
			}
			
			
			// ������ ������ ���������, �ٸ� ���̸�ŭ ���ϰ� ����
			if (truckList.isEmpty()) {
				totalTime += w;
				break;
			}
		}
		
		// ���
		System.out.println(totalTime);
		
	}
	
	// ���
	public static boolean weightCheck (int currentWeight, int nextTruckWeight, int maxWeight) {
		boolean returnType = false;
		
		if (maxWeight > currentWeight + nextTruckWeight) {
			returnType = true;
		}
		
		return returnType;
	}

}
