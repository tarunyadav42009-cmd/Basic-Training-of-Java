import java.util.Scanner;

public class tar {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String ch;
        do {
            int num;
            System.out.println("Enter the number:");
            num = A.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is a Even number!");
            } else {
                System.out.println(num + " is Odd number!");
            }

            System.out.println("Do you Want to continue?(y/n)");
            ch = A.next();
        } while (ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("Y"));
        A.close();
    }
}
