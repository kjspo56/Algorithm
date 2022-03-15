package Bronze3;

import java.util.Arrays;
import java.util.Scanner;

//백준 10818
public class BJ10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + "" + arr[N-1]);
    }
}
