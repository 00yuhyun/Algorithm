package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157_단어공부 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] intArrays = new int[26];

        for (int i = 0; i < s.length(); i++) {
            intArrays[s.charAt(i) - 'A'] += 1;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < 26; i++) {
            if (intArrays[i] > max) {
                max = intArrays[i];
                answer = (char) (i + 'A');
            } else if (max == intArrays[i]) {
                answer = '?';
            }
        }

        System.out.println(answer);

    }
}
