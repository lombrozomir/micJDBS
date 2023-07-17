package model;

public class Showcase {
    private int id;
    private String cpu;
    private int price;
    public Showcase(){

    }

    public Showcase(int id, String cpu, int price) {
        this.id = id;
        this.cpu = cpu;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
