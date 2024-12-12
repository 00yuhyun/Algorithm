package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10809_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strings = str.split("");

        int[] ans = new int[26];

        for (int i = 0; i < 26; i++) {
            ans[i] = -1;
        }

        String[] alphabet = new String[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(a);
            a++;
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (strings[i].equals(alphabet[j])) {
                    if (ans[j] == -1) {
                        ans[j] = i;
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
