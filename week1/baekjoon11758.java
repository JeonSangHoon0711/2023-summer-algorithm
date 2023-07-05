import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baekjoon11758 {
  public static void main(String[] args) throws IOException  {

    int ax,ay,bx,by,cx,cy = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
      
    st = new StringTokenizer(br.readLine());
    ax = Integer.parseInt(st.nextToken());
    ay = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    bx = Integer.parseInt(st.nextToken());
    by = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    cx = Integer.parseInt(st.nextToken());
    cy = Integer.parseInt(st.nextToken());

    System.out.println(CCW(ax,ay,bx,by,cx,cy));
  }
  
  public static int CCW(int ax, int ay, int bx, int by, int cx, int cy){
    int ccw = (bx - cx) * (ay - by) - (by - cy) * (ax - bx);

    if(ccw > 0){ 
      return -1;
    }
    else if(ccw < 0) { 
      return 1;
    }
    else {
      return 0;
    }
  }
}
