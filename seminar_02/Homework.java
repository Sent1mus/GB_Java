/**
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */

package seminar_02;

public class Homework {
    public static void main(String[] args) {

        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("12345"));
        System.out.println(isPalindrome("12321"));
    }

    public static boolean isPalindrome(String source) {
        char[] ch = source.toCharArray();
        for (int i = 0; i < source.length() / 2; i++) {
            if (ch[i] != ch[source.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
