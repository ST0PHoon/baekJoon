package baekjoon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baek_11728_ArraySum {
	static int n,m;
	static ArrayList<Integer>a = new ArrayList<>();
	static ArrayList<Integer>b = new ArrayList<>();
	static ArrayList<Integer>ans = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws  IOException {
		// 입력받기 (scanner 기능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 각 몇개씩 입력할지 설정
		String [] t = br.readLine().split(" ");
		// 입력받은 값 변수에 입력
		n = Integer.parseInt(t[0]);
		m = Integer.parseInt(t[1]);
		// 배열 받기(1) 
		t = br.readLine().split(" ");
		for(int i=0; i<t.length; i++) {
			a.add(Integer.parseInt(t[i]));
		}
		// 배열 받기(2)    
		t = br.readLine().split(" ");
		for(int i=0; i<t.length; i++) {
			b.add(Integer.parseInt(t[i]));
		}
		//Collections으로 오름차순 정령
		Collections.sort(a);
		Collections.sort(b);

		int a_point = 0;
		int b_point = 0;
		
		while(a_point< a.size() && b_point<b.size()) {
			if(a.get(a_point) > b.get(b_point)) {
				ans.add(b.get(b_point));
				b_point++;
			} else {
				ans.add(a.get(a_point));
				a_point++;
			}
		}

		// a_point가 남아 있을경우 나머지 다 넣어준다
		while(a_point < a.size()) {
			ans.add(a.get(a_point++));
		}

		while(b_point <b.size()) {
			ans.add(b.get(b_point++));
		}

		for(int i=0; i<ans.size(); i++) {
			sb.append(ans.get(i)+" ");
        }
        
		System.out.println(sb);
        
    }
}