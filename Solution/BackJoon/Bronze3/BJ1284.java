package Bronze3;

import java.io.*;

public class BJ1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while(N !=0) {
            int answer = 1;
            while( N !=0) {
                int a = N % 10;
                if(a == 0 ){
                    answer += 4;
                } else if (a == 1) {
                    answer += 2;
                } else {
                    answer +=3;
                }
                answer++;
                N /= 10;
            }
            bw.write(answer + "\n");
            N = Integer.parseInt(br.readLine());
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
