import java.util.Scanner;

public class asscending {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int b[] = { 3,2,1 };
        int temp;
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (b[i] < b[j]) {
                    temp = b[i];
                    System.out.print(temp);
                    b[i] = b[j];
                        System.out.print(b[i]);
                    b[j] = temp;
                        System.out.print(b[j]);
                     System.out.println();   
                }
            }
        }
        for (int i = 0; i <=2; i++) {
            System.out.println(b[i]);
        }
        A.close();
    }
} 

