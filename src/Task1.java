import java.util.Arrays;

public class Task1 {
    public static class ArrayMeth {
        public static void printMatrix(int[][] matrix) {
            for (int[] b : matrix) {
                System.out.print("");
                for (int a : b) {
                    System.out.printf("%3d", a);
                }
                System.out.print("");
                System.out.println();
            }
            System.out.println();
        }

        public static int[][] unitaryTransformation(int a) {
            int[][] array = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i == j) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
            }
            return array;
        }

        public static int[][] zeroMatrix(int a) {
            int[][] matrix = new int[a][a];
            for (int[] x : matrix) {
                Arrays.fill(x, 0);
            }
            return matrix;
        }

        public static void main(String[] args) {
//        Написать и протестировать методы работы с квадратны- ми матрицами (матрицы представить в виде двухмерных массивов).
//                Должны присутствовать методы:
//■ создания единичной (диагональной) матрицы;
//■ создания нулевой матрицы;
//■ сложение матриц;
            int[][] FirstArray = new int[3][3];
            // filling in
            for (int i = 0; i < FirstArray.length; i++) {
                for (int j = 0; j < FirstArray[i].length; j++) {
                    FirstArray[i][j] = (int) (Math.random() * 10);
                }
            }

            int[][] SecondArray = new int[3][3];
            // filling in
            for (int i = 0; i < SecondArray.length; i++) {
                for (int j = 0; j < SecondArray[i].length; j++) {
                    SecondArray[i][j] = (int) (Math.random() * 10);
                }
            }

            //first task
            System.out.println("The unitary Matrix is: ");
            printMatrix(unitaryTransformation(3));
            System.out.println();
            //second task
            System.out.println("The zero Matrix is: ");
            printMatrix(zeroMatrix(3));
            //third task
            System.out.println("The result of matrices addiction is: ");
            int n = 3;
            int m = 3;
            int[][]c = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    c[i][j] = FirstArray[i][j] + SecondArray[i][j];
                    System.out.print(c[i][j] + "  ");
                }
                System.out.println();
            }
            //7th task
            System.out.println("First matrix:");
            printMatrix(FirstArray);
            System.out.println("Second matrix:");
            printMatrix(SecondArray);
        }
    }
}
