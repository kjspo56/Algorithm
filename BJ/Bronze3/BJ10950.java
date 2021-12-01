import java.util.Scanner;

//백준 10950번
public class BJ10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int[] arr = new int[c];

        for(int i=0; i < c; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc .close();

        for (int k : arr){
            System.out.println(k);
        }
    }
}
