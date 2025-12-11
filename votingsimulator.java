import java.util.Scanner;
import java.util.Random;
public class VotingSimulator {

    // Function to simulate random votes
    public static int[] generateVotes(int voters) {
        Random rand = new Random();
        int[] votes = new int[4]; // C-A, C-B, C-C, C-D

        for(int i = 0; i < voters; i++) {
            int choice = rand.nextInt(4); // random candidate 0-3
            votes[choice]++;
        }
        return votes;
    }

    // Function to display results
    public static void displayResults(int[] votes) {
        System.out.println("Voting Results:");
        System.out.println("C-A: " + votes[0] + " votes");
        System.out.println("C-B: " + votes[1] + " votes");
        System.out.println("C-C: " + votes[2] + " votes");
        System.out.println("C-D: " + votes[3] + " votes");
    }

    // Function to increment vote for chosen candidate
    public static void incrementVote(int[] votes, int candidate) {
        if(candidate >= 0 && candidate < 4) {
            votes[candidate]++;
        } else {
            System.out.println("Invalid candidate choice!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Age check
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 18) {
            System.out.println("You are not eligible to vote.");
            return;
        }

        // Step 2: Generate random votes
        System.out.print("Enter number of voters to simulate: ");
        int voters = sc.nextInt();

        int[] votes = generateVotes(voters);

        // Step 3: Show results
        displayResults(votes);

        // Step 4: User increments vote
        System.out.println("Choose a candidate to increment vote (0=C-A, 1=C-B, 2=C-C, 3=C-D): ");
        int candidate = sc.nextInt();
        incrementVote(votes, candidate);

        // Step 5: Show updated results
        System.out.println("\nUpdated Results after your vote:");
        displayResults(votes);

        sc.close();
    }
}