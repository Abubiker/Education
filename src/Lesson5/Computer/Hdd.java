package Lesson5.Computer;

public class Hdd {
    String name;
    float volume;
    String type;

    public Hdd() {
    }

    public Hdd(String name, float volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
