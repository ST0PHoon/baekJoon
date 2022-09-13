package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class baek_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> wordListHash = new HashSet<String>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			wordListHash.add(br.readLine());
		}

		// Set을 List로 변환
		List<String> wordList = new ArrayList<>(wordListHash);
		
		// 정렬
		List<String> resultList = sortAlphabetAndLength(wordList);
	
		//한 줄에 하나씩 출력
		for (String word : resultList) {
			System.out.println(word);
		}
	}
	
	public static List<String> sortAlphabetAndLength (List<String> wordList) {
		List<String> resultList = wordList;
		
		// 사전적으로 정렬 (대소문자 구분 x)
		Collections.sort(resultList, String.CASE_INSENSITIVE_ORDER);
		
		// 길이에 따라 정렬
		Collections.sort(resultList, new Comparator<String>(){
	        public int compare(String o1, String o2)
	        {
	            return o1.length() - o2.length();
	        }
	    });
		
		return resultList;
	}

}
