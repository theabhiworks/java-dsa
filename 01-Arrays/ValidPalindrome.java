public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
             // Skip characters that aren't letters or digits
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;

            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
