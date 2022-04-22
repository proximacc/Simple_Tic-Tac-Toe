import java.util.Arrays;

class ArrayOperations {

    public static int[][][] createCube() {

        final int d = 3;
        int[][][] cube = new int[d][d][d];

        for (int a = 0; a < d; a++) {

            for (int b = 0; b < d; b++) {

                for (int c = 0; c < d; c++) {

                    cube[a][b][c] = c + d * b;

                }

            }


        }

        return cube;
    }


}