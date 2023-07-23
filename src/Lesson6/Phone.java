package Lesson6;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 100);
    }

    public Phone() {
        this(" ", " ");
    }

    public void recieveCall(String callerName) {
        System.out.println("Звонок от: " + callerName);
    }

    public void recieveCall(String callerName, String callerNumber) {
        System.out.println("Звонок от: " + callerName + "(" + callerNumber + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println(" Отправляется сообщение на: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("89991236598", "Nokia 3310", 999f);
        Phone phone2 = new Phone("89102584679", "Sony Ericsson", 600f);
        Phone phone3 = new Phone("89656562378", "Iphone", 300f);
        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight);
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight);
        phone1.recieveCall("Петя");
        phone2.recieveCall("Вася");
        phone3.recieveCall("Игнат");
        phone1.recieveCall("Саша", "89155554422");
        phone1.sendMessage("89153694569", "89778996415");
        phone2.sendMessage("89141477856");
        phone3.sendMessage("89773215687", "89655462589", "89456785421");


    }
}
