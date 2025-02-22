package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11047_동전0 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coinValue = new int[N];

        for (int i = 0; i < N; i++) {
            coinValue[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;

        for (int i = N-1; i >= 0; i--) {
            if (K >= coinValue[i]) {
                    cnt += K / coinValue[i];
                    K = K % coinValue[i];
                }
            }
        System.out.println(cnt);
    }
}
