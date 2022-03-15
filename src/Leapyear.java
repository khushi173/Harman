import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter Year : ");
        year = input.nextInt();
        if(year%400 == 0)
        {
            System.out.println(year+" is a leap year ");
        }

        else if (year % 100 == 0)
        {
            System.out.println(year + " is not a leap year.");
        }
        else if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }

    }
}
