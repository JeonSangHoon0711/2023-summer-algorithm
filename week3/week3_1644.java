import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class week3_1644 {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> prime_numbers = new ArrayList<>();
        boolean prime[];
        
        prime = new boolean[N+1];        
        prime[0] = prime[1] = true;       
        for(int i=2; i*i<=N; i++){
            if(!prime[i]) for(int j=i*i; j<=N; j+=i) prime[j]=true;                
        }            
        for(int i=1; i<=N;i++){
        	if(!prime[i]) prime_numbers.add(i);     
        }
        
        int point1=0, point2=0, sum=0, count=0;
        while(true) {
        	if(sum >= N )
                sum -= prime_numbers.get(point2++);
        	else if(point1 == prime_numbers.size()) 
                break;
        	else {
                sum += prime_numbers.get(point1++);       	
            }
        	if(N==sum)
                count++;        	
        }		
        System.out.println(count);	
    }	
}