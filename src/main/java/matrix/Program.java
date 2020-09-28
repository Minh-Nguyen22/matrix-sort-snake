package matrix;

public class Program {

    public static void main(String[] args) {
        int[][] matrix = new int[29][29];
        int i, j, k, f, stack, nk;
        int t = 1;

            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    int numbers = (int) ((Math.random()*(32 + 1)) - 16);
                    matrix[i][j] = numbers;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            while (t == 1) {
                t = 0;
                for (j = 0; j < 4; j++) {
                    if (j == 3) f = 1;
                    else f = 0;
                    if (j % 2 == 0) {
                        for (i = 0; i < 4 - f ; i++) {
                            if (i == 3) k = 0;
                            else k = 1;
                            if (k == 1) nk = 0;
                            else nk = 1;
                            if (matrix[i][j] < matrix[i + k][j + nk]) {
                                stack = matrix[i][j];
                                matrix[i][j] = matrix[i + k][j + nk];
                                matrix[i + k][j + nk] = stack;
                                t = 1;
                            }
                        }
                    }
                    else {
                        for (i = 3; i >= f; i--) {
                            if (i == 0) k = 0;
                            else k = 1;
                            if (k == 1) nk = 0;
                            else nk = 1;
                            if (matrix[i][j] < matrix[i - k][j + nk]) {
                                stack = matrix[i][j];
                                matrix[i][j] = matrix[i - k][j + nk];
                                matrix[i - k][j + nk] = stack;
                                t = 1;
                            }
                        }
                    }
                }
            }
        System.out.println();

            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

