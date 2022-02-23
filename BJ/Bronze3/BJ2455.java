import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2455 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //1번
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        //2번
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        //3번
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();

        //4번
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();

        //1번째 총 인원수
        int A1 = a1 + b1;

        //2번째 총 인원수
        int A2 = A1 - a2 + b2;

        //3번째 총 인원수
        int A3 = A2 - a3 + b3;

        //4번째 총 인원수
        int A4 = A3 - a4 + b4;

        int max = A1;
        if(A2> max) max = A2;
        if(A3> max) max = A3;
        if(A4> max) max = A4;

        System.out.println(max);

    }
}
