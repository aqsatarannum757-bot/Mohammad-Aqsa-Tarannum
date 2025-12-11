public class sumofdigits  {
    static int sum(int start, int end) {
        if (end <= start) {
            return 0;
        }
        return (end - 1) + sum(start, end - 1);
    }
    public static void main(String[] args) {
        int result = sum(1, 7); 
        System.out.println("Sum = " + result);
    }
}