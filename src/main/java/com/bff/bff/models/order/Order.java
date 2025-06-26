package com.bff.bff.models.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;
    private String userId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private boolean isDelivered;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "orderId") // questo collega gli OrderedItem all'Order tramite foreign key
    private List<OrderedItem> orderedItems = new ArrayList<>();

    public Order() {
    }

    public Order(int orderId, String userId, LocalDate date, boolean isDelivered, List<OrderedItem> orderedItems) {
        this.orderId = orderId;
        this.userId = userId;
        this.date = date;
        this.isDelivered = isDelivered;
        this.orderedItems = orderedItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public List<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<OrderedItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.orderId;
        hash = 97 * hash + Objects.hashCode(this.userId);
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + (this.isDelivered ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.orderedItems);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (orderId != other.orderId)
            return false;
        if (!Objects.equals(userId, other.userId))
            return false;
        if (!Objects.equals(date, other.date))
            return false;
        if (isDelivered != other.isDelivered)
            return false;
        if (!Objects.equals(orderedItems, other.orderedItems))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId +
                ", userId=" + userId +
                ", date=" + date +
                ", isDelivered=" + isDelivered +
                ", orderedItems=" + orderedItems + "]";
    }
}
