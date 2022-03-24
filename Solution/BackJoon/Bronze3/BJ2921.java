package Bronze3;


import java.io.*;

public class BJ2921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        //0일떄는 해당사항이 없으므로, 1에서 N까지 시작
        for(int i = 1; i <=N; i++){
            //값의 2배까지 증가하는 값
            for(int j = i; j<= i *2; j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
