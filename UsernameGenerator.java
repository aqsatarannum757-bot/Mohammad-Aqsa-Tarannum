public class UsernameGenerator {
    public static void main(String[] args) {
        String name = "Mohammad Aqsa Tarannum";   
        StringBuilder username = new StringBuilder();
          for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                username.append('.');}
            else if ("aeiouAEIOU".indexOf(ch) == -1) {
                username.append(ch); }}
        System.out.println("Generated Username: " + username.toString());
    } }