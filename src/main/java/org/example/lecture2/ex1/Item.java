package org.example.lecture2.ex1;

public class Item {
    private String id;
    private String name;
    private Shop shop;

    public Item(String id, String name, Shop shop) {
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
