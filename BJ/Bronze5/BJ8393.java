import java.util.Scanner;

//백준 8393번
public class BJ8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 1; i<=a; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
