package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10813_공바꾸기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] balls = new int[n];
        for (int num = 0; num < n; num++) {
            balls[num] = num + 1;
        }


        for (int num = 0; num < m; num++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = 0;

            temp = balls[i - 1];
            balls[i - 1] = balls[j - 1];
            balls[j - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}
