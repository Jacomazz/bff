package com.bff.bff.models;

public class PrizeDTO {
    private long idPrize;
    private String namePrize;
    private int costPrize;

    public long getIdPrize() {
        return idPrize;
    }

    public void setIdPrize(int idPrize) {
        this.idPrize = idPrize;
    }

    public String getNamePrize() {
        return namePrize;
    }

    public void setNamePrize(String namePrize) {
        this.namePrize = namePrize;
    }

    public int getCostPrize() {
        return costPrize;
    }

    public void setCostPrize(int costPrize) {
        this.costPrize = costPrize;
    }

    public PrizeDTO() {
    }

    public PrizeDTO(long idPrize, String namePrize, int costPrize) {
        this.idPrize = idPrize;
        this.namePrize = namePrize;
        this.costPrize = costPrize;
    }
}
