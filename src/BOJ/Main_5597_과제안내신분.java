package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_5597_과제안내신분 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] students = new int[30];

        for (int i = 0; i < 30; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 30; j++) {
                if (students[j] == n) {
                    students[j] = 0;
                }
            }
        }
        Arrays.sort(students);
        for (int num : students) {
            if (num != 0) {
                System.out.println(num);
            }
        }
    }
}
