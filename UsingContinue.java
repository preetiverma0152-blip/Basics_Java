//Continue keyword to use skip an iteration

//Display all numbers enterd by user except multiples of 10

import java.util.Scanner;

public class UsingContinue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your number : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }

            System.out.println("number was : " + n);
        } while (true);
    }
}
