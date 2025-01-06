import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year from 2000 t0 2020: ");
        int year = input.nextInt();
        int days = numberOfDaysinYear(year);
        System.out.println("Number of days in " +year+" are " + days);

        
        
    }
    public static int numberOfDaysinYear(int year){
        int days;
        int daysinLeapyear = 366;
        int daysinYear = 365;
        switch (year) {
            case 2000 -> days = daysinLeapyear;
            case 2004 -> days = daysinLeapyear;
            case 2008 -> days = daysinLeapyear;
            case 2012 -> days = daysinLeapyear;
            case 2016 -> days = daysinLeapyear;
            case 2020 -> days = daysinLeapyear;
            default   -> days = daysinYear;
        }
        return days;
        

    }
    
}
