package Task1;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Vasia Pupkin", 65468646, 45645.52, Account.Currency.USD);
        Account account2 = new Account("John Snow", 4567846, 74586.58, Account.Currency.EUR);
        Account account3 = new Account("Harry Potter", 77458564, -456.85, Account.Currency.BYN);

        System.out.println("Hashcode of the account1 " + account1 + " is " + account1.hashCode());
        System.out.println("Hashcode of the account2 " + account2 + " is " + account2.hashCode());
        System.out.println("Hashcode of the account3 " + account3 + " is " + account3.hashCode());
        System.out.println("--------------------------------------");

        if (account1.equals(account2)) {
            System.out.println("BankAccount1 is equal to BankAccount2");
        }
        else {
            System.out.println("BankAccount1 is not equal to BankAccount2");
        }
        if (account2.equals(account3)) {
            System.out.println("BankAccount2 is equal to BankAccount3");
        }
        else {
            System.out.println("BankAccount2 is not equal to BankAccount3");
        }
        if (account3.equals(account1)) {
            System.out.println("BankAccount3 is equal to BankAccount1");
        }
        else {
            System.out.println("BankAccount3 is not equal to BankAccount1");
        }
    }
}
