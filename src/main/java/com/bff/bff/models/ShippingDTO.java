package com.bff.bff.models;

public class ShippingDTO {
    private int shippingId;
    private int orderId;
    private StatusEnumDTO shippingStatus;

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public StatusEnumDTO getShippinhStatus() {
        return shippingStatus;
    }

    public void setShippinhStatus(StatusEnumDTO shippinhStatus) {
        this.shippingStatus = shippinhStatus;
    }

    public ShippingDTO() {
    }

    public ShippingDTO(int shippingId, int orderId, StatusEnumDTO shippingStatus) {
        this.shippingId = shippingId;
        this.orderId = orderId;
        this.shippingStatus = shippingStatus;
    }
}
