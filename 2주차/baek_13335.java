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
		
		// 기본 정보
		StringTokenizer stInfo = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(stInfo.nextToken());	// 트럭 수
		int w = Integer.parseInt(stInfo.nextToken());	// 다리 길이
		int L = Integer.parseInt(stInfo.nextToken());	// 최대 하중
		
		// 트럭 정보
		StringTokenizer stTruck = new StringTokenizer(br.readLine());
		
		Queue<Integer> truckList = new LinkedList<>();
		
		while (stTruck.hasMoreTokens()) {
			truckList.offer(Integer.parseInt(stTruck.nextToken()));
		}
		
		// 계산
		int currentWeight = 0;	// 현재 다리에 무게
		int totalTime = 0; // 시간이 얼마 지났는가
		
		while (currentWeight != 0 && !truckList.isEmpty()) {	// 다리의 무게 = 0, 트럭리스트가 0 일 떄 종료
			totalTime++;
			
			if (weightCheck(currentWeight, truckList.peek(), L)) {	// 무게 더하기
				
			} else {	// 그냥 진행
				continue;
			}
			
			
			// 마지막 열차가 출발했으면, 다리 길이만큼 더하고 종료
			if (truckList.isEmpty()) {
				totalTime += w;
				break;
			}
		}
		
		// 출력
		System.out.println(totalTime);
		
	}
	
	// 기능
	public static boolean weightCheck (int currentWeight, int nextTruckWeight, int maxWeight) {
		boolean returnType = false;
		
		if (maxWeight > currentWeight + nextTruckWeight) {
			returnType = true;
		}
		
		return returnType;
	}

}
