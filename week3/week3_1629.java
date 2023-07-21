import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class week3_1629 {
 
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long C;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A, B, C));
	}
	
	public static long pow(long A, long exponent, long C) {
		
		if(exponent == 1) {
			return A % C;
		}
		
		long temp = pow(A, exponent / 2, C);

		if(exponent % 2 == 1) {
			return (temp * temp % C) * A % C;
		}
		return temp * temp % C;
		
	}
	
}