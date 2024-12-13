package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2908_상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] a = st.nextToken().split("");
        String[] b = st.nextToken().split("");

        StringBuilder reverseA = new StringBuilder();
        StringBuilder reverseB = new StringBuilder();

        for (int i = a.length - 1; i >= 0; i--) {
            reverseA.append(a[i]);
            reverseB.append(b[i]);
        }

        int numA = Integer.parseInt(reverseA.toString());
        int numB = Integer.parseInt(reverseB.toString());

        System.out.println(Math.max(numA, numB));

    }
}

