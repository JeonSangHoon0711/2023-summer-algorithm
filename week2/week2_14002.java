package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class week2_14002 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N + 1];
		int dp[] = new int[N + 1];
		int result = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
					result = Math.max(dp[i], result);
				}
			}
		}

		int value = result;

		Stack<Integer> stack = new Stack<>();

		for (int i = N; i >= 1; i--) {

			if (value == dp[i]) {

				stack.push(arr[i]);
				value--;
			}
		}
		System.out.println(result);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		br.close();
	}
}