import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}