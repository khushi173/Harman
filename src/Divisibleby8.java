import java.util.Scanner;

public class Divisibleby8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter the value of x : ");
        x = input.nextInt();
        if(x%8 == 0)
            System.out.println(x+" is divisible by 8");
        else
            System.out.println(x+" is not divisible by 8");
    }
}
