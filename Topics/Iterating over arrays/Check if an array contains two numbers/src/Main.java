import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean check = false;
        for (int j = 1; j < len; j++) {
            if (array[j] == n && array[j - 1] == m) {
                check = true;
                break;
            } else if (array[j] == m && array[j - 1] == n) {
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}