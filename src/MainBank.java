public class MainBank {
    public static void main(String[] args) {
        //We moeten een bank-object aanmaken
        Bank bank = new Bank();

        Person someDoctor = new FamilyDoctor();
        someDoctor.setFirstName("Jan");
        someDoctor.setLastName("Jansen");
        someDoctor.setBsnNumber("555888693");
        someDoctor.setStreetName("Nieuwe Gracht");
        someDoctor.setBalance(12000);

        Person someHandyman = new Handyman("Sjaak", "Metselaar", "Keizersgracht",
                "01234567", "1-AAA-2");
        someHandyman.setBalance(800);

        bank.transferMoney(someHandyman, someDoctor, 799);

        System.out.println("Doctor's balance: " + someDoctor.getBalance());
        System.out.println("Handyman's balance " + someHandyman.getBalance());
    }
}