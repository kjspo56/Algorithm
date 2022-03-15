package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] Acards = new int[10];
        int[] Bcards = new int[10];

        int Apoint = 0;
        int Bpoint = 0;
        int lastwin = 0; //초기값 0, A승리 1, B승리 2

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 10; i++) {
            Acards[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 10; i++) {
            Bcards[i] = Integer.parseInt(st.nextToken());
        }

        //승점 구하기
        for (int i = 0; i < 10; i++) {
            if (Acards[i] > Bcards[i]) {
                Apoint += 3;
                lastwin = 1;
            } else if (Acards[i] < Bcards[i]) {
                Bpoint += 3;
                lastwin = 2;
            } else {
                Apoint += 1;
                Bpoint += 1;
            }
        }

        System.out.println(Apoint + " " + Bpoint);

        if (Apoint > Bpoint) { //A승리
            System.out.println("A");
        } else if (Apoint < Bpoint) {   //B승리
            System.out.println("B");
        } else { //비김
            if (lastwin == 1) {  //A승리
                System.out.println("A");
            } else if (lastwin == 2) { //B승리
                System.out.println("B");
            } else { //비김
                System.out.println("D");
            }
        }
    }
}