import java.util.Arrays;

public class Task2 {
    public static void methodInt(int a){
        int[] array = new int[5];
        for (int i = 0; i < a; i++) {
            array[i] = a;
        }
        System.out.println("One-dimensional array of INT type: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void methodString(String b){
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            array[i] = b + " " + i;
        }
        System.out.println("One-dimensional array of STRING type: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void method2Int(int dima, int aimb){
        int[][] array = new int[dima][aimb];
        for (int i = 0; i < dima; i++) {
            for (int j = 0; j < aimb; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Two-dimensional array of INT type: ");
        for (int[] x : array) {
            System.out.print("");
            for (int y : x) {
                System.out.printf("%3d", y);
            }
            System.out.print("");
            System.out.println();
        }
        System.out.println();
    }

    public static void methFloat(int dimA, int dimB,  double x){
        double[][] array = new double[dimA][dimB];
        for (int i = 0; i < dimA; i++) {
            for (int j = 0; j < dimB; j++) {
                array[i][j] = x;
            }
        }

        System.out.println("Two-dimensional array of FLOAT type: ");
        for (double[] a : array) {
            System.out.print("");
            for (double y : a) {
                System.out.printf("%5.2f", y);
            }
            System.out.print("");
            System.out.print("\n");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Написать и протестировать перегруженный метод, выводящий на экран:
        //■ одномерный массив типа int;
        //■ одномерный массив типа String;
        //■ двухмерный массив типа int;
        //■ двухмерный массив типа float.

        methodInt(5);
        methodString("string");
        method2Int(4, 4);
        methFloat(4, 4, 4.4);

    }
}
