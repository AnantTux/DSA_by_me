public class Palindrome {
    public static void main(String[] args) {
        String text = "abcdcba";
        if (isPalindrome(text)) {
            System.out.println('"' + text + "\" is a palindrome.");
        } else {
            System.out.println('"' + text + "\" is NOT a palindrome.");
        }
    }
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;


        while (start < end) {
            if (text.charAt(start) == text.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
