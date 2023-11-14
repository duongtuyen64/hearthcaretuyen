package com.example.healthcare2.adapter;

public class ListItem {
    private int imageResourceId;
    private String itemName;
    private String itemPrice;

    public ListItem(int imageResourceId, String itemName, String itemPrice) {
        this.imageResourceId = imageResourceId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

}
