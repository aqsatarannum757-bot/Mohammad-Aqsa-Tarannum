import java.util.*;
public class ChatFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> badWords = new HashMap<>();
        badWords.put("stupid", "******** 🤬");
        badWords.put("ugly", "******** 😡");
        badWords.put("idiot", "******** 🤯");
        badWords.put("badword", "******** 👿");
        badWords.put("sad", "******** 😒");
        badWords.put("pichii", "******** 😤");
        badWords.put("waste", "******** 🤬");
        System.out.println("Enter your chat message:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            String lowerWord = words[i].toLowerCase();
            if (badWords.containsKey(lowerWord)) {
                words[i] = badWords.get(lowerWord);
            }
        }
        String filtered = String.join(" ", words);
        System.out.println("Filtered Chat: " + filtered);
    }
}