package model;

public class Trash {
    private int id;
    private int UserID;
    private int price;
    private int amountBuy;

    public Trash() {

    }

    @Override
    public String toString() {
        return "Trash{" +
                "id=" + id +
                ", UserID=" + UserID +
                ", price=" + price +
                ", amountBuy=" + amountBuy +
                '}';
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public Trash(int id, int userID, int price, int amountBuy) {
        this.id = id;
        UserID = userID;
        this.price = price;
        this.amountBuy = amountBuy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
