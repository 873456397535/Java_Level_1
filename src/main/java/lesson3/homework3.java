package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        replace0and1();
        fill100();
        less6_multiply_by2();
        diagonal_ones();
        two_values(3, 7);
    }

    private static void replace0and1() {
        int[] zeroes_and_ones = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroes_and_ones.length; i++) {
            int n = zeroes_and_ones[i];
            if (n == 1) {
                System.out.println(0);
            } else if (n == 0) {
                System.out.println(1);
            }
        }
        System.out.println("replace0and1 end");
    }

    private static void fill100() {
        int[] empty = new int[100];
        for (int i = 0; i < empty.length; ++i) {
            System.out.println(i + ++empty[i]);
        }
        System.out.println("fill100 end");
    }

    private static void less6_multiply_by2() {
        int[] data = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                data[i] *= 2;
            }
            System.out.println(data[i]);
        }
        System.out.println("less6_multiply_by2 end");

    }

    private static void diagonal_ones() {
        int[][] square = new int[3][3];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                }
                if (i == 0 && j == 2) {
                    square[i][j] = 1;
                }
                if (i == 2 && j == 0) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("diagonal_ones end");
    }

    private static void two_values(int len, int initialValue) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i] = initialValue;
            System.out.print(data[i] + " ");
        }
    }

}
