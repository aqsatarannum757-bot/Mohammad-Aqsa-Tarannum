import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 6, 7, 9, 9};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        int[] uniqueArr = Arrays.copyOf(arr, j + 1);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}