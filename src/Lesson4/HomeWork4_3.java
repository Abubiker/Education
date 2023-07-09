package Lesson4;

public class HomeWork4_3 {
    public static void main(String[] args) {
        int[] array1 = {8, 7, 3, 3, 7};
        int[] array2 = {4, 6, 7, 1, 2};
        System.out.print("Массив 1: ");
        printArray(array1);
        System.out.print("Массив 2: ");
        printArray(array2);
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше.");} else if (average1 < average2) {
            System.out.println("Среднее арифметическое второго массива больше.");
        } else {
            System.out.println("Средние арифметические равны.");
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
