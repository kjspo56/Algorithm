import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ15873 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        //앞의 숫자가 두 자리 수 이하이고 뒤의 숫자가 한 자리 수일 때
        int res = (a / 10) + (a % 10);

        //앞의 숫자가 한 자리 수이고 뒤의 숫자가 두 자리 수 이하일 때
        if (a / 10 > 10) {
            res = (a / 100) + (a % 100);
        }

        //앞과 뒤 모두 두 자리 수일 때(경우의 수는 1)
        if (a == 1010) {
            res = 20;
        }

        System.out.println(res);
    }
}
