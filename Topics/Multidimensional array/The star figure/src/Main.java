import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = n / 2;
        String[][] star = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ".";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    star[i][j] = "*";
                } else if (i == n - j - 1) {
                    star[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            star[k][i] = "*";
            star[i][k] = "*";
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }
    }
}