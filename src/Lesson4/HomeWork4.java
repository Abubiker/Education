package Lesson4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число " + searchNumber + " найдено в массиве");
        }  else {
            System.out.println("Число " + searchNumber + " не найдено в массиве");
        }
    }

}
