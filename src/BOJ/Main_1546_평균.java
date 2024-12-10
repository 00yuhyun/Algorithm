package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] score = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        double[] newScore = new double[n];

        for (int i = 0; i < n; i++) {
            newScore[i] = (double) score[i] / max * 100;
        }

        double newSum = 0;
        for (int i = 0; i < n; i++) {
            newSum += newScore[i];
        }
        double result = newSum / n;

        System.out.println(result);
    }
}
