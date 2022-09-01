package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baek_13335 {

	static int currentWeight = 0;	// 현재 다리에 무게
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 기본 정보
		StringTokenizer stInfo = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(stInfo.nextToken());	// 트럭 수
		int w = Integer.parseInt(stInfo.nextToken());	// 다리 길이
		int L = Integer.parseInt(stInfo.nextToken());	// 최대 하중
		
		// 트럭 정보
		StringTokenizer stTruck = new StringTokenizer(br.readLine());
		
		List<Integer> truckList = new ArrayList<Integer>();
		int[] truckTurn = new int[n];
		
		while (stTruck.hasMoreTokens()) {
			truckList.add(Integer.parseInt(stTruck.nextToken()));
		}

		// 계산
		int totalTime = 0; // 시간이 얼마 지났는가
		int currentTruck = 0;
		
		while (true) {
			totalTime++;
			
			changeWeight(truckTurn, currentTruck, truckList, w);	// 한 턴 진행
			
			if (weightCheck(truckList.get(currentTruck), L)) {	// 트럭 출발 시키기
				truckTurn[currentTruck] = truckTurn[currentTruck] + 1;
				currentWeight = currentWeight + truckList.get(currentTruck);
				currentTruck++;	//다음 트럭 준비
			} 
			
			// 마지막 열차가 출발했으면, 다리 길이만큼 더하고 종료
			if (currentTruck == n) {
				totalTime += w;
				break;
			}
		}
		
		// 출력
		System.out.println(totalTime);
		
	}
	
	// 기능 - 다리의 한계를 초과 여부 확인.
	public static boolean weightCheck (int nextTruckWeight, int maxWeight) {
		boolean returnType = false;
		
		if (maxWeight >= currentWeight + nextTruckWeight) {
			returnType = true;
		}
		
		return returnType;
	}

	// 기능 2 - 트럭이 빠져 나갈 때(w +1) 무게 제거
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
