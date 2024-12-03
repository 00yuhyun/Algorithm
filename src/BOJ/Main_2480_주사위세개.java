package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2480_주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        if (one == two && one == three && two == three) {
            int sum = 10000 + (one * 1000);
            System.out.println(sum);
        } else if (one == two && one != three && two != three) {
            int sum = 1000 + (one * 100);
            System.out.println(sum);
        } else if (two == three && one != three && two != one) {
            int sum = 1000 + (two * 100);
            System.out.println(sum);
        } else if (one == three && one != two && two != three) {
            int sum = 1000 + (one * 100);
            System.out.println(sum);
        } else {
            if (one > two && one > three) {
                System.out.println(100 * one);
            } else if (two > one && two > three) {
                System.out.println(100 * two);
            } else if (three > one && three > two) {
                System.out.println(100 * three);
            }
        }
    }
}
