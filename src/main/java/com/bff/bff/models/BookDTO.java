package com.bff.bff.models;

public class BookDTO {
    private int idBook;
    private String nameBook;

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public BookDTO() {
    }

    public BookDTO(int idBook, String nameBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
    }
}
