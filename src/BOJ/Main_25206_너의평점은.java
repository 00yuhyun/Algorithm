package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_25206_너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Float[] scoreArrays = new Float[20];
        String[] alphabetArrays = new String[20];
        HashMap<String, Float> scores = new HashMap<>();
        scores.put("A+", 4.5F);
        scores.put("A0", 4.0F);
        scores.put("B+", 3.5F);
        scores.put("B0", 3.0F);
        scores.put("C+", 2.5F);
        scores.put("C0", 2.0F);
        scores.put("D+", 1.5F);
        scores.put("D0", 1.0F);
        scores.put("F", 0.0F);

        for (int i=0; i<20; i++) {
            String[] s = br.readLine().split(" ");
            scoreArrays[i] = Float.parseFloat(s[1]);
            alphabetArrays[i] = s[2];
        }

        float sum = 0;
        float majorSum = 0;

        for (int i=0; i<20; i++) {
            if (!alphabetArrays[i].equals("P")) {
                majorSum += scoreArrays[i];
                sum += scoreArrays[i] * scores.get(alphabetArrays[i]);
            }
        }

        float answer = sum / majorSum;

        System.out.printf("%.6f",answer);

    }
}
