import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String arr = scanner.nextLine();
        String[] array = arr.split(" ");
        int n = scanner.nextInt();
        int rotations = n % array.length;
        String add = null;
        
        
        for (int i = 0; i < rotations; i++) {
            add = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = add;
        }
        for (String ch : array) {
            System.out.print(ch + " ");
        }
    }
}
