package com.heitian.ssm.model;

public class Book {
    private Long bid;
    private String bName;
    private String bAuthor;
    private double bPrice;
    private int bQuantity;
    private String bCategory;
    private String bDiscr;

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }

    public String getbDiscr() {
        return bDiscr;
    }

    public void setbDiscr(String bDiscr) {
        this.bDiscr = bDiscr;
    }

    public int getbQuantity() {
        return bQuantity;
    }

    public void setbQuantity(int bQuantity) {
        this.bQuantity = bQuantity;
    }

    public String getbCategory() {
        return bCategory;
    }

    public void setbCategory(String bCategory) {
        this.bCategory = bCategory;
    }
}