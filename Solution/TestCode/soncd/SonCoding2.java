package soncd;

public class SonCoding2 {

    public static boolean isPalindrome(String str) {
        // 공백 제거
        String cleanStr = str.replaceAll("\\s", "");

        // 문자열을 소문자로 변환
        cleanStr = cleanStr.toLowerCase();

        // 문자열의 길이
        int length = cleanStr.length();

        // 문자열을 반으로 나눠서 비교
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // 테스트
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("aba"));   // true
        System.out.println(isPalindrome("xcx"));   // true
        System.out.println(isPalindrome("hello")); // false
    }
}

