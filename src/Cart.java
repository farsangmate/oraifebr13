import java.util.ArrayList;
import java.util.List;

public class Cart {

    // add, remove, getTotal, limit felett vagyunk-e,
    // a kosár tartalmának kilistázása,ha adunk hozzá/elveszünk visszaadja az elemek számát

    private List<Food> cartList = new ArrayList<>();

    private final int discountLimit = 100;

    public int getDiscountLimit() {
        return discountLimit;
    }

    public int addItem(Food item) {
        cartList.add(item);
        return cartList.size();
    }

    public int removeItem(Food item) {
        cartList.remove(item);
        return cartList.size();
    }

    public int getTotal() {
        int total = 0;
        for (Food item : cartList) {
            total = total + item.price;
        }
        return total;
    }

    public boolean isLimitHigher() {
        return getTotal() > discountLimit;

    }

    public void showItems() {
        for (Food item : cartList) {
            System.out.println(item.toString());
        }
    }

}
