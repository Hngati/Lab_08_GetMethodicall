import java.util.Scanner;

public class FavNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int favoriteInt = SafeInput.getInt(in, "Enter your favorite number");
            double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite number double");
            System.out.println("Favorite Number: " + favoriteInt);
            System.out.println("Favorite Number: " + favoriteDouble);
        }
    }



