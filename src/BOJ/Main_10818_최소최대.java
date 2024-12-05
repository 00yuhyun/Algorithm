package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10818_최소최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min;
        int max;

        int[] intArrays = new int[n];

        for (int i = 0; i < n; i++) {
            intArrays[i] = Integer.parseInt(st.nextToken());
        }
        min = intArrays[0];
        max = intArrays[0];


        for (int num : intArrays) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
