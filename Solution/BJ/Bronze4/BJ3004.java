import java.io.*;

public class BJ3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        bw.write(sb.append(printNum(a)).toString());
        bw.close();
    }

    static int printNum(int num) {
        // 짝수인 경우
        if(num%2 != 1) {
            num = num / 2;
            num = num + 1;
            num *= num;
            return num;
        } else {
            // 홀수인 경우
            int row = ((num-1)/2)+1;
            int col = ((num+1)/2)+1;
            return row*col;
        }
    }
}
