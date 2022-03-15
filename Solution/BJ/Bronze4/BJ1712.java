import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1712 {
    public static void main(String[] args) throws IOException {

        /*Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C <= B) {
            System.out.println("-1");
        } else {
            System.out.println((A/(C-B)) + 1);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println((A/(C-B))+1);
        }

    }
}
