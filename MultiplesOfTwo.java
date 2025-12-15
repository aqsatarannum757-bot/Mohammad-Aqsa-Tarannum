public class MultiplesOfTwo {
    public static void main(String[] args) {
        int[] multiples = new int[100];
        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = 2 * (i + 1);  
        }
        System.out.println("First 100 multiples of 2:");
        for (int num : multiples) {
            System.out.print(num + " ");
        }
    }
}

  