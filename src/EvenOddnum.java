import java.util.Scanner;

public class EvenOddnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x ;
        System.out.println("Enter the value of x : ");
        x = input.nextInt();
        if(x%2 == 0)
            System.out.println(x+" is even number");
        else
            System.out.println(x+" is odd number");
    }
}
