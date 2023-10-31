import java.util.Scanner;

public class BirthDateTime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
            int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

            int days;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    days = SafeInput.getRangedInt(in, "Enter the day ", 1, 30);
                    break;
                case 2:
                    days = SafeInput.getRangedInt(in, "Enter the day ", 1, 29);
                    break;
                default:
                    days = SafeInput.getRangedInt(in, "Enter the day ", 1, 31);
                    break;
            }

            int hours = SafeInput.getRangedInt(in, "Enter  hour of birth", 1, 24);
            int minutes = SafeInput.getRangedInt(in, "Enter  minute of birth", 1, 59);

            System.out.println("Date and Time of Birth: " + year + "/" + month + "/" + days + " " + hours + ":" + minutes);
        }
    }

