package Bronze3;


import java.io.*;

public class BJ2921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i<=N; i++){
            for(int j = i; j <=N; j++){
                ans = ans + i + j;
            }
        }
        bw.write(ans + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
