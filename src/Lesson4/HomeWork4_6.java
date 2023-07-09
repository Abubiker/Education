package Lesson4;

import java.util.Arrays;

public class HomeWork4_6 {
    public static void main(String[] args) {
         String[] names = new String[]{"Андрей", "Дмитрий", "Игорь", "Анастасия", "Арсений"};
        System.out.println("Исходный массив: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Отсортированный массив: " + Arrays.toString(names));
    }
}
