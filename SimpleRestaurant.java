import java.util.*;
public class SimpleRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foodNames = {"Pizza", "Burger", "Pasta", "Sandwich", "Coffee"};
        double[] foodPrices = {250, 120, 180, 100, 80};
        LinkedList<Integer> order = new LinkedList<>();
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            for (int i = 0; i < foodNames.length; i++) {
                System.out.println((i + 1) + ". " + foodNames[i] + " - ₹" + foodPrices[i]);
            }
            System.out.println("0. Finish Order");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice > 0 && choice <= foodNames.length) {
                order.add(choice - 1); 
                System.out.println(foodNames[choice - 1] + " added to your order.");
            }
        } while (choice != 0);
        double total = 0;
        System.out.println("\n--- Your Order ---");
        for (int index : order) {
            System.out.println(foodNames[index] + " - ₹" + foodPrices[index]);
            total += foodPrices[index];
        }
        System.out.println("Total Payment: ₹" + total);
        sc.close();
    }
}