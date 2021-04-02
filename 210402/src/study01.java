import java.util.Scanner;

// 백준 2739번
public class study01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 숫자입력
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
    }
}
