import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class week3_10830 {
    private static final int MOD = 1000;
    public static int[][] baseMatrix;
    public static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                matrix[i][j] %= MOD;
            }
        }

        baseMatrix = matrix;
        
        int[][] answer = matrixPow(k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(answer[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    
    public static int[][] matrixMult(int[][] a, int[][] b) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {   // row of a
            for (int j = 0; j < n; j++) {   // column of b
                for (int x = 0; x < n; x++) {
                    arr[i][j] += a[i][x]*b[x][j];
                }
                arr[i][j] %= MOD;
            }
        }
        return arr;
    }

    public static int[][] matrixPow(long b) {
        if (b == 1) {
            return baseMatrix;
        }
        int[][] tmp = matrixPow(b/2);
        int[][] tmpPow2 = matrixMult(tmp, tmp);
        return b%2 == 0 ? tmpPow2 : matrixMult(tmpPow2, matrixPow(1));
    }

}
