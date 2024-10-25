import java.util.Scanner;

public class LabTask10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for year and first day of the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = scanner.nextInt();

        // Print the calendar for the year
        printCalendar(year, firstDay);
        scanner.close();
    }

    public static void printCalendar(int year, int firstDay) {
        // Array of month names
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        // Array of days in each month
        int[] daysInMonth = {
            31, isLeapYear(year) ? 29 : 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        // Iterate through each month
        for (int month = 0; month < 12; month++) {
            // Print the month name centered
            System.out.printf("\n%14s %d\n", monthNames[month], year);
            System.out.println("---------------------------"); // Line under the month name
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print leading spaces for the first week
            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }

            // Print the days of the month
            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%3d ", day);
                // If it's Saturday, move to the next line
                if ((firstDay + day) % 7 == 0) {
                    System.out.println();
                }
            }

            // Update firstDay for the next month
            firstDay = (firstDay + daysInMonth[month]) % 7;
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
