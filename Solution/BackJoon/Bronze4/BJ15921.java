package Bronze4;

import javax.xml.parsers.SAXParser;
import java.io.*;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class BJ15921 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] num; //수찬이의 연습 기록 저장 배열
    static int sum = 0; //합

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine()); //연습 기록 개수

        //N일때 0처리
        if(N==0){
            System.out.println("divide by zero");
            System.exit(0);
        }

        num = new int[N];   //연습 기록 저장 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //연습기록 배열에 저장하면서 합 구하기
        for(int i = 0; i < N ; i++){
            int temp = Integer.parseInt(st.nextToken());
            num[i] = temp;
            sum += temp;
        }

        double average = (double) sum / N; //평균 구하기
        double Ex = 0; //기대값

        //기대값 구하기
        for(int i = 0; i < N; i++){
            int start = num[i];
            Ex += (start*((double)1 / N));
        }

        if(Ex == 0) System.out.println("divide by zero");
        else System.out.printf("%2f", average/Ex);
    }
}
