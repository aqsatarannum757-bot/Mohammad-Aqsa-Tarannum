public class str {
   public static void main(String[] args) {
        String s = "MOHAMMAD AQSA TARANNUM";
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        System.out.println(count);
    }
}