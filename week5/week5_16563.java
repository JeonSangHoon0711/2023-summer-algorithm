
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class week5_16563 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());	
		
		int[] minFactor = new int[5000001];
		
		for(int i=2; i<=5000000; i++) {
			minFactor[i] = i;
		}
		
		for(int i = 2; i*i <= 5000000; i++) {
			
			if(minFactor[i] == i) {	
				for(int j = i*i; j <= 5000000; j += i) {	
					if(minFactor[j] == j) {
						minFactor[j] = i;
					}
				}
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			while(n > 1) {
				sb.append(minFactor[n] + " ");
				n /= minFactor[n];
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}