package Bronze5;

import java.io.*;
import java.util.StringTokenizer;

public class BJ14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //세로값
        int M = Integer.parseInt(st.nextToken()); //가로값
        int K = Integer.parseInt(st.nextToken()); //관중석 번호

        /*int count =0;

        for (int i=0; i<N; i++){
            for(int j =0; j<M; j++){
                if(K==count) {
                    bw.write(i+" "+j);
                    bw.flush();
                }
                count++;
            }
        }*/
        bw.write(String.valueOf((K / M)+" "+(K - (M * (K / M)))));
        bw.flush();
        bw.close();
    }
}
