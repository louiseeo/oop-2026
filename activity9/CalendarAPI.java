package activity9;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarAPI {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);

        input.close(); // close scanner
    }

    /**
     * Prints the calendar for the month and year
     */
    public static void printMonth(int year, int month) {
        // print the title of calendar
        printMonthTitle(year, month);

        // print the body of calendar
        printMonthBody(year, month);
    }

    /**
     * Prints the month title, e.g., January 2007
     */
    public static void printMonthTitle(int year, int month) {
        System.out.println("\n       " + getMonthName(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    }

    /**
     * Prints the month body
     */
    public static void printMonthBody(int year, int month) {
        // get the start day of the month
        int firstDay = getStartDay(year, month);

        // get the number of days in a month
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        // align first line
        for (int space = 0; space < firstDay; space++) {
            System.out.print("    ");
        }
        // print days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // move to next line every saturday
            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }
    }

    /**
     * Returns month name from 1-12.
     * Uses array instead of switch for better data lookup
     * 
     * @param month 1=Jan, 2=Feb..., 12=Dec
     * @return returns the full month name
     */
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month - 1]; // Month 1-12 -> 0-11
    }

    /**
     * Get the start day of the month
     * 
     * @param year  e.g. 2026
     * @param month 1-12
     * @return 0=Sun, 1=Mon..., 6=Sat
     */
    public static int getStartDay(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * Get the number of days in a given month
     * 
     * @param year  e.g. 2026
     * @param month 1-12
     * @return 28-31 days
     */
    public static int getNumberOfDaysInMonth(int year, int month) {
        GregorianCalendar cal = new GregorianCalendar(year, month - 1, 1);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}