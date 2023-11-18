package com.example.healthcare2.data.model;

public class PostMedicines {
    private int img_medicines;
    private String name;
    private String price;
    private int ic_star1;
    private int ic_star2;
    private int ic_star3;
    private int ic_star4;
    private int ic_star5;

    public PostMedicines(int img_medicines, String name, String price, int ic_star1) {
        this.img_medicines = img_medicines;
        this.name = name;
        this.price = price;
        this.ic_star1 = ic_star1;
        this.ic_star2 = ic_star2;
        this.ic_star3 = ic_star3;
        this.ic_star4 = ic_star4;
        this.ic_star5 = ic_star5;
    }

    public int getImg_medicines() {
        return img_medicines;
    }

    public void setImg_medicines(int img_medicines) {
        this.img_medicines = img_medicines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIc_star1() {
        return ic_star1;
    }

    public void setIc_star1(int ic_star1) {
        this.ic_star1 = ic_star1;
    }

    public int getIc_star2() {
        return ic_star2;
    }

    public void setIc_star2(int ic_star2) {
        this.ic_star2 = ic_star2;
    }

    public int getIc_star3() {
        return ic_star3;
    }

    public void setIc_star3(int ic_star3) {
        this.ic_star3 = ic_star3;
    }

    public int getIc_star4() {
        return ic_star4;
    }

    public void setIc_star4(int ic_star4) {
        this.ic_star4 = ic_star4;
    }

    public int getIc_star5() {
        return ic_star5;
    }

    public void setIc_star5(int ic_star5) {
        this.ic_star5 = ic_star5;
    }
}
