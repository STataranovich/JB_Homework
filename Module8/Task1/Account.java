package Task1;

import java.util.Objects;

public class Account {
    public enum Currency {
        USD, EUR, BYN};

    private int number;
    private double amount;
    private String owner;
    private Currency currency;

    public Account(String owner, int number, double amount, Currency cur) {
        this.number = number;
        this.amount = amount;
        this.owner = owner;
        this.currency = cur;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmmount() {
        return amount;
    }

    public void setAmmount(int amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (number == 0) {
            if (other.number != 0)
                return false;
        } else if (number != other.number)
            return false;
        if (amount == 0) {
            if (other.amount != 0)
                return false;
        } else if (amount != other.amount)
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (currency == null) {
            if (other.currency != null)
                return false;
        } else if (!currency.equals(other.currency))
            return false;
        return true;
    }



    public int hashCode() {
        return Objects.hash(owner, number, amount, currency);
    }


    public String toString(){
        return "[" + "owner = " + owner + ", number = " + number + ", amount = " + amount + ", currency = " + currency + "]";
    }
}
