import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            } else {
                break;
            }
        }
    }
}