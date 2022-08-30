package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baek_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int[] resultArray = new int[K];
		
		for (int i = 0; i < K; i++) {
			// ���̽��� ����, �⺻����
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());		// ��� ������
			int M = Integer.parseInt(st.nextToken()) + 1;	// ��� �����ϴ���
			
			// ���̽��� ����, �߿䵵
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			
			while (st2.hasMoreTokens()) {
				list.add(Integer.parseInt(st2.nextToken()));
			}
			
			// ���
			int result = 0;
			int aimNumber = list.get(M - 1);
			
			while (result != 10) {
				result++;
				
				int listSize = list.size();
				
				if (checkPriority(list, list.get(listSize - 1))) {	// �ڱ⺸�� �߿䵵�� ū ���� ������
					if (M == listSize) {
						resultArray[i] = result;
						break;
					}
					
					if (aimNumber == list.get(listSize - 1)) {
						M++;
						list = modifyList(list, listSize);
					} else {
						list.remove(listSize - 1);
					}
					
				} else {	// ������ �ѱ�� �Լ� ����

					if (M == listSize) {
						M = 1;
					} else {
						M++;
					}
					
					list = modifyList(list, listSize);
				}	
			}
		}
		
		// ���
		for (int i = 0; i < K; i++) {
			System.out.println(resultArray[i]);
		}

	}
	
	// ���䵵 �Ǻ�
	public static boolean checkPriority(List<Integer> checkList, int checkNumber) {
		boolean result = true;
		
		for (int i = 0; i < checkList.size() - 1; i++) {
			if (checkNumber < checkList.get(i)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	// �ڷ� �ѱ��
	public static List<Integer> modifyList(List<Integer> list, int numberLocation) {
		
		list.add(0, list.get(numberLocation - 1));
		
		list.remove(list.size() - 1);
		
		return list;
		
	}

}
