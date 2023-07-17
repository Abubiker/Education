package Lesson5.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(999f, "Xiaomi Mi turbo super 23t");
        computer1.print();
        Ram ram = new Ram("Corsair", 32f);
        Hdd hdd = new Hdd("Samsung", 2f, "internal");
        Computer computer2 = new Computer(4236f, "Apple mac", ram, hdd);
        computer2.print();
    }
}
