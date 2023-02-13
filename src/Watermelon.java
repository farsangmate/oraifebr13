public class Watermelon extends Food {
    public Watermelon(String name, int price) {
        super(name, price);
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
