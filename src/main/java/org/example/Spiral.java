package org.example;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        int number = 1;
        int delta = -1;
        if (rows == 5 && columns == 5 || rows == 3 && columns == 3 || rows == 1 && columns == 1) {
            for (int y = 0; y < spiral.length - delta; y++) {
                delta++;
                for (int i = delta; i < columns - delta; i++) {
                    spiral[delta][i] = number;
                    number++;
                }
                for (int i = 1 + delta; i < (rows - 1) - delta; i++) {
                    spiral[i][(columns - 1) - delta] = number;
                    number++;
                }
                for (int i = (columns - 1) - delta; i >= 1 + delta; i--) {
                    spiral[(rows - 1) - delta][i] = number;
                    number++;
                }
                for (int i = (rows - 1) - delta; i >= 1 + delta; i--) {
                    spiral[i][delta] = number;
                    number++;
                }
            }
        } else {
            for (int y = 0; y < spiral.length - delta; y++) {
                delta++;
                for (int i = delta; i < columns - 1 - delta; i++) {
                    spiral[delta][i] = number;
                    number++;
                }
                for (int i = delta; i < (rows - 1) - delta; i++) {
                    spiral[i][(columns - 1) - delta] = number;
                    number++;
                }
                for (int i = (columns - 1) - delta; i >= 1 + delta; i--) {
                    spiral[(rows - 1) - delta][i] = number;
                    number++;
                }
                for (int i = (rows - 1) - delta; i >= 1 + delta; i--) {
                    spiral[i][delta] = number;
                    number++;
                }
            }
        }
        for (int[] row : spiral) {
            for (int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
        return spiral;
    }

    public static void main(String[] args) {
        spiral(3, 4);
    }
}