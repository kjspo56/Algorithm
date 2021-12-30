import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10797 {
    public static void main(String[] args) throws IOException {

       /* Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int res=0;
        for(int i = 0; i<5; i++){
            if(sc.nextInt()==T)
                res++;
        }
        System.out.println(res);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());  //날짜 일 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int res = 0;    //차량번호와 일치하는 결과
        for(int i = 0; i<5; i++){
            if(day == Integer.parseInt(st.nextToken())){
                res++;
            }
            //차량 5대만큼 for문을 돌려서 일치하는 값은 res 값 추가
        }
        System.out.println(res);
    }
}
