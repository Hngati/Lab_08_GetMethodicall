import java.util.Scanner;

public class Reggie {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
            String mNumberPattern = "^(M|m)\\d{5}$";
            String menuChoicePattern = "^[OoSsVvQq]$";

            String ssn = SafeInput.getRegExString(in, "Enter  SSN (e.g., 123-45-6789)", ssnPattern);
            String mNumber = SafeInput.getRegExString(in, "Enter  M number (e.g., M12345)", mNumberPattern);
            String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (Oo, Ss, Vv, or Qq)", menuChoicePattern);

            System.out.println("SSN: " + ssn);
            System.out.println("M Number: " + mNumber);
            System.out.println("Menu Choice: " + menuChoice);
        }
    }

