package ExceptionHandlingDemo;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
