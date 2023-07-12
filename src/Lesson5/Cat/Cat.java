package Lesson5.Cat;

public class Cat {
    String name ;
    int age;
    int amount;
    boolean feed (int food) {
        if (food < amount) {
            return false;
        } else {
            return true;
        }

    }
}
