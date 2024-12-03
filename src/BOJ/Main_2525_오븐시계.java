package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525_오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int duration = Integer.parseInt(br.readLine());

        int afterHour = hour;
        int afterMin = min+duration;

        if (afterMin>=60) {
            int ansMin = afterMin%60;
            int add = afterMin/60;
            afterHour += add;
            afterMin = ansMin;
            if (afterHour>=24) {
                afterHour = afterHour%24;
            }
        }
        System.out.println(afterHour+ " "+afterMin);

    }
}
