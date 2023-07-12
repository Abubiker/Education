package Lesson5.CreditCard;

public class CreditCard {
    String number;
    int balance;

    CreditCard(String number, int initialBalance) {
        this.number = number;
        this.balance = initialBalance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw() {
        if (balance >= 300) {
            balance -= 300;
        } else {
            System.out.println("Мало денег");
        }
    }
    void printCardInfo() {
        System.out.println("Номер Счета: " + number);
        System.out.println("Ваш Баланс: " + balance);
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("3553535", 0);
        CreditCard card2 = new CreditCard("9898989", 0);
        CreditCard card3 = new CreditCard("4141414",  600);

        card1.deposit(100000);
        card2.deposit(777);
        card3.withdraw();

        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}
