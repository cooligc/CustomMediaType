package io.cooligc.mediatype.model;

import java.util.Date;

public class Customer {

    private String name;
    private String id;
    private Date purchaseDate;

    public Customer(String name, String id, Date purchaseDate) {
        this.name = name;
        this.id = id;
        this.purchaseDate = purchaseDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
