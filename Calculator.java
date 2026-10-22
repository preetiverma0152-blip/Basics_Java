
//SIMPLE CALCULATOR
import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter n : ");
        int b = sc.nextInt();
        System.out.println("enter operator58 : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.print("Wrong operator");
                sc.close();
        }

    }

}
