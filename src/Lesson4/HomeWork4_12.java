package Lesson4;

import java.util.Arrays;

public class HomeWork4_12 {
    public static void main(String[] args) {
       int[][] array = {
                {5, 1, 7},
                {2, 6, 4},
                {3, 8, 9}
        };
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
