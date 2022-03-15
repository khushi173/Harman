import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 0;
        int Reversenum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER num : ");
        num = input.nextInt();
        while( num != 0 )
        {
            Reversenum = Reversenum * 10;
            Reversenum = Reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of the number is: "+Reversenum);
    }
}
