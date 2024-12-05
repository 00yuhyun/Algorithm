package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10871_X보다작은수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        st1 = new StringTokenizer(br.readLine());

        int[] intArray = new int[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(st1.nextToken());
        }

        for (int num : intArray) {
            if (num < x) {
                System.out.print(num + " ");
            }
        }
    }
}
