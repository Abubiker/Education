package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите размер массива (от 6 до 10): ");
            n = scanner.nextInt();
        } while (n <= 5 || n > 10);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] evenArray = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index] = array[i];
                index++;
            }
        }
        evenArray = Arrays.copyOf(evenArray, index);

        System.out.println("Второй массив (чётные элементы): " + Arrays.toString(evenArray));
    }
}
