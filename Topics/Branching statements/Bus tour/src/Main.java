import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int a = scanner.nextInt();
        int[] bridges = new int[a];
        int crash = 0;
        for (int i = 0; i < a; i++) {
            bridges[i] = scanner.nextInt();
            if (bridges[i] <= busHeight) {
                crash = i + 1;
                break;
            }
        }
        if (crash > 0) {
            System.out.println("Will crash on bridge " + crash);
        } else {
            System.out.println("Will not crash");
        }
    }
}