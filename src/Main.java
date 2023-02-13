public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Beer soproni = new Beer("Nem Ipa",15);
        soproni.setIpa(false);
        Watermelon dinnye = new Watermelon("Görög dinnye",20);
        dinnye.setCountry("Kína");

        cart.addItem(new Beer("Ipa Beer",10));
        cart.addItem(soproni);
        cart.addItem(new Bread("Fehér",50));
        cart.addItem(dinnye);

        System.out.println("Total price: " + cart.getTotal());
        System.out.println("Higher than limit:" + cart.isLimitHigher());
        cart.showItems();
    }


}