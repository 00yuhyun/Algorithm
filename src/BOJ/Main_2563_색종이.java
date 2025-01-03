package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2563_색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] background = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                background[i][j] = 0;
            }
        }

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    background[x + a][y + b] = 1;
                }
            }
        }
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (background[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}

