package JaGu10Week;

import java.util.*;

public class pro_42577 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/42577
		// 프로그래머스 / 전화번호 목록

		System.out.println(solution2());

	}
		
		public static boolean solution() {
			
			boolean answer = true;
			
			String[] phone_book = {"97674223", "1195524421", "119"};
			
			Arrays.sort(phone_book, Comparator.comparing(String::length));
			
			for (int i = 0; i < phone_book.length - 1; i++) {
				for (int j = i + 1; j < phone_book.length; j++) {
					
					if (phone_book[j].indexOf(phone_book[i]) == 0) {
						answer = false;
						break;
					}
				}
			}
			
			return answer;
		}
		
		public static boolean solution2() {
			
			boolean answer = true;
			
			String[] phone_book = {"97674223", "1195524421", "119"};
			
			Arrays.sort(phone_book);
			
			for (int i = 0; i < phone_book.length - 1; i++) {
					
				if (phone_book[i+1].indexOf(phone_book[i]) == 0) {
					answer = false;
					break;
				}
				
			}
			
			return answer;
		}

	}
