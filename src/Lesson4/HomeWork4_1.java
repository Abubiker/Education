package Lesson4;

import java.util.Scanner;

public class HomeWork4_1 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 9, 2, 5, 8};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int numberToRemove = scanner.nextInt();
        boolean foundNumber = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToRemove) {
                foundNumber = true;
                removeElement(numbers, i);
                i--;
            }
        }
        if (foundNumber) {
            System.out.println("Элементы массива после удаления:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } else {
            System.out.println("Число не найдено в массиве.");
        }
    }
    private static void removeElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
        }
    }
}