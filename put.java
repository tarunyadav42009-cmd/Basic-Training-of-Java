import java.util.Scanner;

public class put {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String ch;
        do {

            int Year;

            System.out.println("Enter the Year:");
            Year = A.nextInt();

            if (Year % 4 == 0 && Year % 100 != 0 || (Year % 400 == 0)) {
                System.out.println(Year + " is a leap year!");
            } else {
                System.out.println(Year + " is not a leap year!");
            }
            System.out.println("Do you Want to continue?(y/n)");
            ch = A.next();

        } while (ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("Y"));

        A.close();

    }
}