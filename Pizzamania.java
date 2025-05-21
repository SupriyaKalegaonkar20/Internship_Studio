import java.util.Scanner;

public class Pizzamania {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ordering = true;

        System.out.println("Welcome to Pizza shop!");

        while (ordering) {
            System.out.println("\nChoose Pizza Variant:");
            System.out.println("1. Veg Pizza");
            System.out.println("2. Non-Veg Pizza");
            System.out.println("3. Delux Veg Pizza (extra cheese & toppings)");
            System.out.println("4. Delux Non-Veg Pizza (extra cheese & toppings)");
             System.out.println("\n Select any one option :");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            int basePrice = 0;
            int extraCheeseCost = 30;
            int extraToppingsCost = 40;

            // Assign base price dynamically based on choice
            switch (choice) {
                case 1:
                    basePrice = 120; // example base price for Veg Pizza
                    break;
                case 2:
                    basePrice = 150; // base price for Non-Veg Pizza
                    break;
                case 3:
                    basePrice = 180; // base price for Delux Veg Pizza
                    break;
                case 4:
                    basePrice = 220; // base price for Delux Non-Veg Pizza
                    break;
                default:
                    System.out.println("Invalid pizza choice! Exiting...");
                    return; // exit program
            }

            int bill = basePrice;

            System.out.print("Add Extra Cheese for Rs." + extraCheeseCost + "? (yes/no): ");
            String extraCheese = sc.nextLine().trim().toLowerCase();

            if (extraCheese.startsWith("y")) {
                bill += extraCheeseCost;
            }

            System.out.print("Add Extra Toppings for Rs." + extraToppingsCost + "? (yes/no): ");
            String extraToppings = sc.nextLine().trim().toLowerCase();

            if (extraToppings.startsWith("y")) {
                bill += extraToppingsCost;
            }

            System.out.println("Total Bill Amount: Rs. " + bill);
            System.out.println("Thank you for ordering from Pizzamania!");

            System.out.print("Do you want anything else? (yes/no): ");
            String wantMore = sc.nextLine().trim().toLowerCase();

            if (wantMore.startsWith("y")) {
                ordering = true; // continue ordering
            } else if (wantMore.startsWith("n")) {
                ordering = false; // stop ordering
                System.out.println("Thank you");
            } else {
                System.out.println("Invalid input. Exiting anyway...");
                ordering = false;
            }
        }

        sc.close();
    }
}
