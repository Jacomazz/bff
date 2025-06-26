package com.bff.bff.BFFService;


import java.util.List;

public interface IBFFService {

public Object getBooks();

public Object placeOrder(int idLibro, int nCopie, String codiceFiscale, String indirizzo);

public Object checkOrderState(String codiceFiscale, int id);

public Object checkPrizes();

public Object checkFP(String codiceFiscale);

public Object redeemPrize(String codiceFiscale, int idPrize);
}
