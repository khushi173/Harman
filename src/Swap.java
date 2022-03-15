import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("ENTER a: ");
        a = input.nextInt();
        System.out.println("ENTER b: ");
        b = input.nextInt();
            System.out.println("Before Swapping numbers are :"+a+" "+b);
            c = a;
            a = b;
            b = c;
            System.out.println("After Swapping numbers are: "+a+" "+b);
            System.out.println();

    }

}


