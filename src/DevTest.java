import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        double weight = SafeInput.getDouble(in, "Enter your weight");
        System.out.println("You entered: " + weight);

        // Test getRangedInt
        int score = SafeInput.getRangedInt(in, "Enter your score", 0, 100);
        System.out.println("You entered: " + score);

        // Test getRangedDouble
        double price = SafeInput.getRangedDouble(in, "Enter the price", 0, 3000);
        System.out.println("You entered: " + price);

        // Test getYNConfirm
        boolean confirmed = SafeInput.getYNConfirm(in, "Are you sure (Y/N)?");
        System.out.println("Confirmed: " + confirmed);

        // Test getRegExString
        String email = SafeInput.getRegExString(in, "Enter your email", "\\w+@\\w+\\.\\w+");
        System.out.println("You entered: " + email);
    }
}
