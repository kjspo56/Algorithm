package Bronze4;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ11943 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       String str1[] = br.readLine().split(" ");
       String str2[] = br.readLine().split(" ");

       int A1 = Integer.parseInt(str1[0]);
       int A2 = Integer.parseInt(str2[0]);
       int B1 = Integer.parseInt(str1[1]);
       int B2 = Integer.parseInt(str2[1]);

       bw.write(String.valueOf(Math.min(A1 + B2, A2 + B1)));
       bw.flush();

    }
}
