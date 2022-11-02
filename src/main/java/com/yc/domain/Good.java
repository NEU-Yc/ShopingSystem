package com.yc.domain;

public class Good {
    private Integer id;
    private Integer merId;
    private String  name;
    private Integer price;
    private Integer inventory;
    private String description;

    public Good() {

    }

    public Good(Integer merId, String name, Integer price, Integer inventory, String description) {
        this.merId = merId;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", merId=" + merId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", description='" + description + '\'' +
                '}';
    }
}
