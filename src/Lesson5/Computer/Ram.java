package Lesson5.Computer;

public class Ram {
    String name;
    float volume;

    public Ram() {
    }

    public Ram(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    public void print() {
        System.out.println( this.toString());
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
