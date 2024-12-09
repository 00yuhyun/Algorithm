package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_2052_나머지 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] rest = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int rest_n = n % 42;
            rest[i] = rest_n;
        }


        Set<Integer> set = new HashSet<>();

        for (int num : rest) {
            set.add(num);
        }

        System.out.println(set.size());

    }
}
