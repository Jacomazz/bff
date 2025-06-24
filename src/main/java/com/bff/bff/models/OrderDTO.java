package com.bff.bff.models;

import java.awt.print.Book;
import java.util.List;

public class OrderDTO {
    private Long orderId;
    private List<Book> booksList;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OrderDTO() {
    }

    public OrderDTO(Long orderId, List<Book> booksList, String address) {
        this.orderId = orderId;
        this.booksList = booksList;
        this.address = address;
    }
}
