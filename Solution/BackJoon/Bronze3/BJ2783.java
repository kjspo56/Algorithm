package Bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        double [] arr = new double[n+1];
        arr[0]=(double) x/y;
        for(int i =0; i<n; i++){
            int x_1=sc.nextInt();
            int y_1=sc.nextInt();
            arr[i+1]=(double) x_1/y_1;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*1000);
    }
}
