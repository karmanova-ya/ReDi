public class Palindrome {
    public static boolean isPalindrome(String inputString) {

        if (inputString.length() <= 1) {
            return true;
        } else {
            inputString = inputString.replace(" ", "").toLowerCase(); // in case of sentences we need to remove the spaces and convert all the letters into lower case
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }
}
