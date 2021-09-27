import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write((a+b) + "\n");
        bw.write((a-b) + "\n");
        bw.write((a*b) + "\n");
        bw.write((a/b) + "\n");
        bw.write((a%b) + "\n");

        bw.flush();
        bw.close();*/

       /* System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);*/


       /* StringBuilder sb = new StringBuilder();
        sb.append(a+b);
        sb.append('\n');

        sb.append(a-b);
        sb.append('\n');

        sb.append(a*b);
        sb.append('\n');

        sb.append(a/b);
        sb.append('\n');

        sb.append(a%b);

        System.out.println(sb);*/

    }
}
