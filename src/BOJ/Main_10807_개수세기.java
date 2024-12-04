package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10807_개수세기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[n];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int num : intArray) {
            if(num == v) {
                cnt +=1;
            }
        }
        System.out.println(cnt);
    }
}
