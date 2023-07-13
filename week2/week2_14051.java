package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week2_14051 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] t = new int[n];
		int[] p = new int[n];
		
		StringTokenizer st;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		br.close();

		//dp : N일에 얻을 수 있는 최대 수익
		int[] dp = new int[n+1];
		
		
		for (int i=0; i<n; i++) {
			if (i + t[i] <= n) {

				dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);

			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		System.out.println(dp[n]);
		
	}
}


