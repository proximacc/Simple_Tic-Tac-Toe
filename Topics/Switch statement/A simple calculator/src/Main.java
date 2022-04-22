import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String operator = scanner.next();
        long b = scanner.nextLong();
        long i = 0;

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    i = a / b;
                    System.out.println(i);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}