import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon10773 {
  public static void main(String[] args) throws IOException  {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Stack<Integer> stack = new Stack<Integer>();

    int N = Integer.parseInt(br.readLine());
    int sum = 0;

    for(int i = 0; i < N; i++){
      int num = Integer.parseInt(br.readLine());
      if(num == 0){
        stack.pop();
      }
      else{
        stack.push(num);
      }
    }
    for(int i : stack){
      sum += i;
    }
    System.out.println(sum);

      
  }
  

}
