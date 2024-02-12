import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1-2
        System.out.println("Задача 1-2");

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }

        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        int[] c = {10, 15, 20, 25, 30};
        System.out.println(Arrays.toString(c));


        // Задача 3
        System.out.println("Задача 3");
        int[] r = new int[3];
        r[0] = 1;
        r[1] = 2;
        r[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(r[i]);
                break;
            }
            System.out.print(r[i] + ", ");
        }
        System.out.println();

        double[] t = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(t[i]);
                break;
            }
            System.out.print(t[i] + ", ");
        }

        int[] y = {10, 15, 20, 25, 30};
        for (int i = 4; i >= 0; i--) {
            if (i == 0) {
                System.out.println(y[i]);
                break;
            }
            System.out.print(y[i] + ", ");
        }
        // Задача 4
        System.out.println("Задача 4");
        int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= g.length - 1; i++) {
            if (g[i] % 2 != 0){
                g[i] = g[i] + 1;
            }
            System.out.print(g[i] + " ");

        }
    }




    }
