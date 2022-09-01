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
			int M = Integer.parseInt(st.nextToken());	// ��� �����ϴ���
			
			// ���̽��� ����, �߿䵵
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			
			while (st2.hasMoreTokens()) {
				list.add(Integer.parseInt(st2.nextToken()));
			}
			
			// ���
			int result = 0;	// ����� ��, ���� 1 ���� ����
			
			while (true) {	
				if (checkPriority(list, list.get(0))) {	// �ڱ⺸�� �߿䵵�� ū ���� ������
					if (M == 0) {	// ��ǥ�� �ϴ� �� ���
						result++;
						resultArray[i] = result;
						break;
					}
					// �߿䵵�� ������, ��ǥ���ϴ� ���� �ƴ� ���
					M--;
					list.remove(0);
					result++;
					
				} else {	// ū ���� ������ �ڷ� �ѱ��
					if (M == 0) {	// ��ǥ�� �ϴ� ��
						M = list.size() - 1;
					} else {	// ��ǥ�� �ϴ� �� �ƴϸ�, ������ ��ĭ
						M--;
					}
					// �ڷ� �ѱ��
					list = modifyList(list);
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
		// 2��° ������ ������ ������ �ڱ⺸�� ū �� �ִ��� Ȯ��
		for (int i = 1; i < checkList.size(); i++) {
			if (checkNumber < checkList.get(i)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	// �ڷ� �ѱ��
	public static List<Integer> modifyList(List<Integer> list) {
		list.add(list.get(0));
		
		list.remove(0);
		
		return list;
	}

}
