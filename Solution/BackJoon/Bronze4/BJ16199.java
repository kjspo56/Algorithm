package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ16199 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y =- Integer.parseInt(st.nextToken());
        int M =- Integer.parseInt(st.nextToken());
        int D =- Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Y += Integer.parseInt(st.nextToken());
        M += Integer.parseInt(st.nextToken());
        D += Integer.parseInt(st.nextToken());

        //만 나이
        if(M>0) System.out.println(Y);
        else if (M<0) System.out.println(Y-1);
        else {
            if(D >= 0) System.out.println(Y);
            else System.out.println(Y-1);
            }
        //세는 나이
            System.out.println(Y+1);

        //연 나이
            System.out.println(Y);
        }
    }
