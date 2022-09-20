package JaGu3Week;

import java.io.*;
import java.util.*;

public class baek_7795_A {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while (T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int count = 0;
            for (int i : A)
                for (int j : B){
                    if (i<=j) break;
                    else count ++;
                }
            sb.append(count+"\n");
        }
        System.out.print(sb);
    }
}

