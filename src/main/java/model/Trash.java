package model;

public class Trash {
    private int id;
    private User user;
    private int price;
    private int amountBuy;

    public Trash() {

    }

    public Trash(int id, User user, int price, int amountBuy) {
        this.id = id;
        this.user = user;
        this.price = price;
        this.amountBuy = amountBuy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(int amountBuy) {
        this.amountBuy = amountBuy;
    }
}
