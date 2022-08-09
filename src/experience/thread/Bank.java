package experience.thread;

public class Bank {
    private int amount = 1000;
//
    public synchronized void transfer(int money) {
        int newBalance = amount - money;
        amount = newBalance;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.transfer(10000);
        int amount = bank.amount;
        bank.transfer(amount);

        System.out.println(amount);

    }
}
