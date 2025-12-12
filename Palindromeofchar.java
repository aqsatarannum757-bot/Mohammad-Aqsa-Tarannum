public class Palindromeofchar {
    public static void main(String[] args) {
        String original = "madam";
        StringBuilder sb = new StringBuilder(original);
        if (original.equals(sb.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}