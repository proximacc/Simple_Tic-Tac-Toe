import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        int counter = 0;

        for (int elem : array) {
            if (elem == number) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}