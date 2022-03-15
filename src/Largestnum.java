import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter the value of x: ");
        x = input.nextInt();
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        System.out.println("Enter the value of z: ");
        z = input.nextInt();
        if(x>=y&&x>=z)
            System.out.println(x+" is the largest number");

        else if(y>=x&&y>=z)
            System.out.println(y+" is the largest number");
        else
            System.out.println(z+" is the largest number");



    }
}
