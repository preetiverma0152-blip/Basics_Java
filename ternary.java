
public class ternary {
    public static void main(String args[]) {
        int number = 4;

        // ternary operator

        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

        int marks = 23;

        String status = ((marks >= 33)) ? "PASS" : "FAIL";
        System.out.println(status);
    }
}
