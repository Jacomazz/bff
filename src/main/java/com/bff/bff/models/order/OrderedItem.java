package com.bff.bff.models.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderedItem {
    @Id
    @GeneratedValue
    private int itemId;

    private int amount;
    private double price;

    public OrderedItem() {
    }

    public OrderedItem(int itemId, int amount, double price) {
        this.itemId = itemId;
      
        this.amount = amount;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + itemId;
      
        result = prime * result + amount;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderedItem other = (OrderedItem) obj; // Modificato per coerenza (da OrderBook a OrderedItem)
        if (itemId != other.itemId)
            return false;
        if (amount != other.amount)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OrderedItem [itemId=" + itemId +
                ", amount=" + amount +
                ", price=" + price
                + "]";
    }
}
