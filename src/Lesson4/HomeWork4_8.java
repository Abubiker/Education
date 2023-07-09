package Lesson4;

import java.util.Scanner;

public class HomeWork4_8 {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для увеличения элементов: ");
        int incrementValue = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += incrementValue;
                }
            }
        }
        System.out.println("Измененный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
