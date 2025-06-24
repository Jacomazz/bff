package com.bff.bff.BFFService;

import com.bff.bff.models.BookDTO;
import com.bff.bff.models.OrderDTO;
import com.bff.bff.models.PrizeDTO;
import com.bff.bff.models.StatusEnumDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBFFService {

public List<BookDTO> getBooks();

public OrderDTO placeOrder(int idLibro, int nCopie, String codiceFiscale, String indirizzo);

public StatusEnumDTO checkOrderState(String codiceFiscale, int id);

public List<PrizeDTO> checkPrizes();

public int checkFP(String codiceFiscale);

public PrizeDTO redeemPrize(String codiceFiscale, int idPrize);
}
