public class Beer extends Food {
    public Beer(String name, int price) {
        super(name, price);
    }

    private boolean isIpa = true;

    public boolean isIpa() {
        return isIpa;
    }

    public void setIpa(boolean ipa) {
        isIpa = ipa;
    }
    @Override
    public String toString () {
        super.toString();
        return getPrice()+ " - " + getName();

    }

}
