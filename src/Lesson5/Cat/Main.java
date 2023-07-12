package Lesson5.Cat;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.amount = 4;
        boolean notNungry = cat.feed(6);
        if (notNungry) {
            System.out.println("Сыт ");
        }
        else {
            System.out.println("Не сыт ");
        }
    }

}
