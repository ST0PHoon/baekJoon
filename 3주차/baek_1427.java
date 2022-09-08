package JaGu3Week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class baek_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] list = br.readLine().split("");

		List<String> numberList = new ArrayList<String>(Arrays.asList(list));
		
		Collections.sort(numberList, Collections.reverseOrder());
		
		StringBuilder sb  = new StringBuilder();
		
		for (String st : numberList) {
			sb.append(st);
		}
		
		System.out.println(sb);
	}

}
