package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_1316_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            String word = br.readLine();

            Set<Character> wordSet = new HashSet<>();
            char prev = '\0';
            boolean answer = true;

            for (int j = 0; j < word.length(); j++) {
                char now = word.charAt(j);

                if (now != prev && wordSet.contains(now)) {
                    answer = false;
                }

                prev = now;
                wordSet.add(now);
            }

            if (answer) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
