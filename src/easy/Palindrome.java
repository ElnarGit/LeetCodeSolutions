package easy;

public class Palindrome {

    public boolean isPalindrome(String s){
        String res = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        return sb.toString().equals(res);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome.isPalindrome(s));
    }
}
