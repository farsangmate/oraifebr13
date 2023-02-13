import java.time.LocalDate;

public class Bread extends Food{
    public Bread(String name, int price) {
        super(name, price);
    }

    private LocalDate date = LocalDate.now();

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



}
