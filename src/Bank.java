public class Bank extends Person {

    public void transferMoney(Person sender, Person recipient, double amount) {
        if(amount > sender.getBalance()) {
            System.out.println("The sender does not have enough money");
        } else {
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
        }
    }
}