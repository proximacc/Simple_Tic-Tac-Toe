import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int add = array[array.length - 1];
        int[] destArray = new int[n];
        System.arraycopy(array, 0, destArray, 1, array.length - 1);
        destArray[0] = add;
        for (int a : destArray) {
            System.out.print(a + " ");
        }
    }    
}
