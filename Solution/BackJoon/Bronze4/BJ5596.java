package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ5596 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = 0; //민국
        int T = 0; //만세

        int a = Integer.parseInt(st.nextToken());




        System.out.println(S);
        System.out.println(T);



        System.out.println(S>=T ? S : T);

    }
}
