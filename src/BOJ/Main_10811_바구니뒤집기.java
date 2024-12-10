package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10811_바구니뒤집기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n + 1];

        for (int num = 1; num <= n; num++) {
            bucket[num] = num;
        }

        for (int num = 0; num < m; num++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp;

            while (i < j) {
                temp = bucket[i];
                bucket[i] = bucket[j];
                bucket[j] = temp;
                i++;
                j--;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(+bucket[i] + " ");
        }
    }
}
