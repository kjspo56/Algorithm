import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ10162 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        if (T % 10 !=0){
            bw.write("-1");
        } else {
            int[] timeBtn = {300, 60, 10};  //5분 1분 10초
            String count = "";
            for(int i = 0; i< timeBtn.length; i++){
                count += T / timeBtn[i] + " ";
                T %= timeBtn[i];
            }

            bw.write(String.valueOf(count));
        }
            bw.flush();*/

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A = 300; //5분
        int B = 60; //1분
        int C = 10; //10초
        answer = 0;

        if(N % 10 != 0) {
            System.out.println(-1); //안되는 조건 먼저 설정
        } else {
            answer = 0;
            if (N >= A) {
                N = calculate(N, A);
            }
            System.out.println(answer + " ");
            answer = 0;
            if (N >= B) {
                N = calculate(N, B);
            }
            System.out.println(answer + " ");
            answer = 0;
            if (N >= C) {
                N = calculate(N, C);
            }
            System.out.println(answer);
        }
    }
    static int answer;
    static int calculate(int N, int value) {
        answer = N / value;
        return N % value;
    }
}
