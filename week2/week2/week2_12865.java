package week2.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week2_12865 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] c = new int[N + 1];
        int[] v = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            c[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][k + 1];

        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j < k + 1; j++) {
                if (j < c[i]) {
									dp[i][j] = dp[i - 1][j];
									continue;	
								}
								dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - c[i]] + v[i]);
            }
        }

        System.out.println(dp[N][k]);
				br.close();
    }
}