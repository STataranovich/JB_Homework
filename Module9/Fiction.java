package Module9;

public class Fiction extends Book{
    private int yearPublished;
    public Fiction (String name, int yearPublished, int price) {
        super(name, price);
        setName(name);
        setPrice(price);
        this.yearPublished = yearPublished;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int datePublished) {
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return "[Fiction: " + name + ", " + yearPublished + " year" + ", " + price + " BYN"+"]";
    }
}
