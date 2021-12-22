import java.util.Scanner;

public class BJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();   //방학 총 일수
        int A = sc.nextInt();   //국어 총 페이지
        int B = sc.nextInt();   //수학 총 페이지
        int C = sc.nextInt();   //하루에 풀 수 있는 국어 최대 페이지
        int D = sc.nextInt();   //하루에 풀 수 있는 수학 최대 페이지

        int day = 0;    //최대 놀 수 있는 날

        if(A%C==0) {
            day = (A/C);
        } else {
            day = (A/C)+1;
        }

        if(B%D==0){
            day = Math.max(day, B/D);
        } else {
            day = Math.max(day, (B/D) +1);
        }

        System.out.println(L - day);
    }
}
