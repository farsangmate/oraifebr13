public class Food {

    public String name = "";
    public int price = 0;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
