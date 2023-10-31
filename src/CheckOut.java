import java.util.Scanner;

public class CheckOut {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double totalCost = 0.0;

            do {
                double itemPrice = SafeInput.getRangedDouble(in, "Enter  item price from ", 0.50, 10.00);
                totalCost += itemPrice;

                if (!SafeInput.getYNConfirm(in, "Do you have more items?")) {
                    break;
                }
            } while (true);

            System.out.printf("Total cost: $%.2f\n", totalCost);
        }
    }

