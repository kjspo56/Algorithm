package soncd;

public class SonCoding {

    public static void main(String[] args) {
        int Start = 'a';
        int End = 'j';

        int n = End - Start + 1;

        // 상단 부분 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (Start + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (Start + j));
            }
            System.out.println();
        }

        // 하단 부분 출력
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (Start + j));
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (Start + j));
            }
            System.out.println();
        }
    }
}


