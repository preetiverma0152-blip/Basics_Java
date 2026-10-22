import java.util.Scanner;

public class JavaWhileLoops {
    public static void main(String args[]) {

        // int counter = 0;
        // while (counter < 10) {
        // System.out.println("Hello World");
        // counter++;
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("printed HW 10x");
        sc.close();
    }
}
