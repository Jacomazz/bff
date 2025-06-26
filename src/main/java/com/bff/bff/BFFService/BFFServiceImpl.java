package com.bff.bff.BFFService;

import org.springframework.stereotype.Service;

@Service
public class BFFServiceImpl implements IBFFService {
    @Override
    public Object getBooks() {
        return null;
    }

    @Override
    public Object placeOrder(int idLibro, int nCopie, String codiceFiscale, String indirizzo) {
        return null;
    }

    @Override
    public Object checkOrderState(String codiceFiscale, int id) {
        return null;
    }

    @Override
    public Object checkPrizes() {
        return null;
    }

    @Override
    public Object checkFP(String codiceFiscale) {
        return null;
    }

    @Override
    public Object redeemPrize(String codiceFiscale, int idPrize) {
        return null;
    }
}
