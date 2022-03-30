package Bronze3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2965 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] point = new int[3];

        point[0] = Integer.parseInt(st.nextToken());
        point[1] = Integer.parseInt(st.nextToken());
        point[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(point);
        if(point[2] - point[1] >= point[1] - point[0]){
            bw.write(point[2] - point[1] - 1 + "\n");
        } else {
            bw.write(point[1] - point[0] - 1 + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
