package Module9;

public class Ebook extends Book{
    protected String size;
    public Ebook (String name, String size, int price) {
        super(name, price);
        setName(name);
        setPrice(price);
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "[Ebook: " + name + ", " + size + ", " + price + " BYN"+"]";
    }
}
class History extends Ebook{
    private String country;
    public History(String name, String country, String size, int price) {
        super(name, size, price);
        setName(name);
        setPrice(price);
        setSize(size);
        this.country = country;
    }
    private String getCountry() {
        return country;
    }

    public String toString() {
        return "[History: " + name + " for " + country + ", " + size + ", "+ price + " BYN"+"]";
    }

}
