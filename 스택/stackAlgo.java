package dongbinna;

import java.util.Stack;

public class stackAlgo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(4);
		s.pop();
		
		while (!s.empty()) {
			// 최상단 메소드 출력시 peek 을 사용한다.
			System.out.println(s.peek() + " ");
			s.pop();
		}

	}

}
