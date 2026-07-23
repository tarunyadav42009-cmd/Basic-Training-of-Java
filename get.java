import java.util.Scanner;

public class get {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int day[] = new int[44];

        System.out.println("Enter the number of Day:");
        for (int j = 0; j <= 4; j++) {
            day[j] = A.nextInt();
        }
        int sum = 0;
        for (int j = 0; j <= 4; j++) {
            System.out.println("The day you entered is " + day[j]);
            sum = sum + day[j];
        }
        System.out.println("Sum of days is " + sum);
        A.close();
    }
}