import java.util.Scanner;

public class strcmp {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        String name = "Vipol";
        String name1 = "Vipol";

        if (name.compareTo(name1) == 0) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        A.close();
    }
}