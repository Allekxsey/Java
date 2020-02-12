package Lesson_2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 1, 0, 0, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[8];
        myMass(arr2, 3);


        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        milt6(arr3, 6, 2);

        int[][] arr2d = new int[6][6];
        cube(arr2d, 1);

        int[] arr5 = new int[10];
        minOrMax(arr5, 50);

    }

    public static void myMass(int[] arr2, int n) {
        for (int i = 0, j = 0; i < arr2.length; i++, j += n) {
            arr2[i] += j;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void milt6(int[] arr3, int max, int g) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < max) {
                arr3[i] *= g;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void cube(int[][] arr2d, int a) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                if ((i == j) || (j + i) == (arr2d.length - 1)) {
                    arr2d[i][j] = a;
                    System.out.print(arr2d[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void minOrMax(int[] arr5, int y) {
        Random numbers = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = numbers.nextInt(y);
        }
        int a = arr5[0];
        int b = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < a) {
                a = arr5[i];
            }
            if (arr5[i] > b) {
                b = arr5[i];
            }
        }
        System.out.println(Arrays.toString(arr5) + "\n" + "Наименьшее значение массива  " + a + "\n" + "Наибольшее значение массива " + b);
    }
}
