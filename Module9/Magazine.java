package Module9;

public class Magazine extends Book {
    private String month;
    public Magazine (String name,int price, String month) {
        super(name, price);
        setName(name);
        setPrice(price);
        this.month=month;
    }
    public String getDate() {
        return month;
    }

    public String toString() {
        return "[Magazine: " + name + ", Month: " + month + ", " + price + " BYN"+"]";
    }

}
