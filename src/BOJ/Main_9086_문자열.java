package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9086_문자열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String[] strings = str.split("");
            System.out.println(strings[0] + strings[strings.length-1]);
        }
    }
}

