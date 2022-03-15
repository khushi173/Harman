import java.util.Scanner;

public class Smallestnum {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x, y;
        System.out.println("Enter the value of x: ");
        x = input.nextInt();
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        if(x<=y)
            System.out.println(x+" is the smallest value");

        else
            System.out.println(y+" is the smallest number");

    }
}


