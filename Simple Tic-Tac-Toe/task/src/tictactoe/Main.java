package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] arrayGrid = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
            arrayGrid[i][j] = "_";
        }

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayGrid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");

        int counterCoordinates = 0;
        int counterWin = 0;
        String previousCoordinate = "_";

        while (counterWin < 1) {
            while (counterCoordinates < 1) {

                System.out.println("Enter the coordinates: ");
                String coordinates = scanner.nextLine();

                try {
                    String[] pieces = coordinates.split(" ");
                    int first = Integer.parseInt(pieces[0]);
                    int second = Integer.parseInt(pieces[1]);
                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                    continue;
                }
                String[] pieces = coordinates.split(" ");
                int first = Integer.parseInt(pieces[0]);
                int second = Integer.parseInt(pieces[1]);
                if (first > 3 || second > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }

                if (arrayGrid[first - 1][second - 1].equals("_")) {
                    if (previousCoordinate.equals("X")) {
                        arrayGrid[first - 1][second - 1] = "O";
                        counterCoordinates++;
                        previousCoordinate = "O";
                    } else {
                        arrayGrid[first - 1][second - 1] = "X";
                        counterCoordinates++;
                        previousCoordinate = "X";
                    }
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
            }
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(arrayGrid[i][j] + " ");
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("---------");


            counterCoordinates = 0;

            String xxx = "[X, X, X]";
            String ooo = "[O, O, O]";
            int counterSpaces = 0;
            int counterRowX = 0;
            int counterRowO = 0;

            String diagonal1 = arrayGrid[0][0] + arrayGrid[1][1] + arrayGrid[2][2];
            String diagonal2 = arrayGrid[0][2] + arrayGrid[1][1] + arrayGrid[2][0];

            if (diagonal1.contains("XXX") || diagonal2.contains("XXX")) {
                counterRowX++;
            } else if (diagonal1.contains("OOO") || diagonal2.contains("OOO")) {
                counterRowO++;
            }

            for (int k = 0; k < 1; k++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (arrayGrid[i][j].contains("_")) {
                            counterSpaces++;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    if (Arrays.toString(arrayGrid[i]).equals(xxx)) {
                        counterRowX++;
                    } else if (Arrays.toString(arrayGrid[i]).equals(ooo)) {
                        counterRowO++;
                    } else if ((arrayGrid[0][i] + arrayGrid[1][i] + arrayGrid[2][i]).equals("XXX")) {
                        counterRowX++;
                    } else if ((arrayGrid[0][i] + arrayGrid[1][i] + arrayGrid[2][i]).equals("OOO")) {
                        counterRowO++;
                    }
                }

                if (counterRowX == 1) {
                    System.out.println("X wins");
                    counterWin++;
                    break;
                } else if (counterRowO == 1) {
                    System.out.println("O wins");
                    counterWin++;
                    break;
                } else if (counterSpaces == 0) {
                    System.out.println("Draw");
                    counterWin++;
                    break;
                }
            }


        }
    }
}
