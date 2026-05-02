public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        Calculator calculator = new Calculator();

        System.out.println("addition operation: " + calculator.add(a, b));
        System.out.println("subtraction operation: " + calculator.subtract(a, b));
    }
}