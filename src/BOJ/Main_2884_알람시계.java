package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2884_알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        int afterHour = hour;
        int afterMin = min - 45;

        if (afterMin < 0) {
            afterMin = afterMin + 60;
            afterHour = hour - 1;
            if (afterHour < 0) {
                afterHour = 23;
            }
        }
        System.out.println(afterHour + " " + afterMin);
    }
}
