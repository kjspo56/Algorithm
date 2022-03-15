import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        int time = 0;

        if (A<=0){
            int temp = -(A);
            time += (B*E) + (temp*C) + D;
        } else if (A>0) {
            B -= A;
            time = B*E;
        }
        System.out.println(time);

       /* System.out.println(go(A,B,C,D,E));
    }
    static int go(int now, int target, int C, int D, int E) {
        if(now == target) {
            return 0;
        } else if (now < 0) {
            return go(now + 1, target, C, D, E) + C;
        } else if (now==0){
            return go(now + 1, target, C, D, E) + D + E;
        } else {
            return  go(now + 1, target, C, D, E) + E;
        }*/
    }
}
