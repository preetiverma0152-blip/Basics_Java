import java.util.Scanner;

public class JavaInputProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // sum = a + b;
        int Product = a * b;

        System.out.println(Product);
        sc.close();
    }
}
