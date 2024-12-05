package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2562_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intArrays = new int[9];

        for (int i = 0; i < 9; i++) {
            intArrays[i] = Integer.parseInt(br.readLine());
        }
        int max = intArrays[0];

        int index = 0;

        for (int i = 0; i < 9; i++) {
            if (intArrays[i] > max) {
                max = intArrays[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
