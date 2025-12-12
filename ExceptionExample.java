public class ExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;  
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}