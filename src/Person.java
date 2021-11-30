public class Person {

    private String firstName;
    private String lastName;
    private String streetName;
    private String bsnNumber;

    //Lege constructor
    public Person() {
    }

    //Constructor
    public Person(String firstName, String lastName, String streetName, String bsnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.bsnNumber = bsnNumber;
    }


    // Getter lastName
    public String getLastName() {
        return lastName;
    }

    //Setter lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Overige getters & setters weggelaten.

    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public void work() {
        System.out.println("The person works.");
    }

    public class() {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }



}


