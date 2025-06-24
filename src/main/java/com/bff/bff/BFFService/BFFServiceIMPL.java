package com.bff.bff.BFFService;


import com.bff.bff.models.BookDTO;
import com.bff.bff.models.OrderDTO;
import com.bff.bff.models.PrizeDTO;
import com.bff.bff.models.StatusEnumDTO;
import com.example.api.RewardsApi;
import com.example.model.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BFFServiceIMPL implements IBFFService {

    @Autowired
    private RewardsApi rewardsApi;

    @Override
    public List<BookDTO> getBooks() {
//        Da fare la chiamata
        return List.of();
    }

    @Override
    public OrderDTO placeOrder(int idLibro, int nCopie, String codiceFiscale, String indirizzo) {
//                Da fare la chiamata
        return null;
    }

    @Override
    public StatusEnumDTO checkOrderState(String codiceFiscale, int id) {
//                Da fare la chiamata
        return null;
    }

    @Override
    public List<PrizeDTO> checkPrizes() {
        ResponseEntity<List<Rewards>> prizes = rewardsApi.getAllRewards();
        List<Rewards> list = prizes.getBody();
        List<PrizeDTO> prizeDTOS = new ArrayList<>(List.of());
//        assert list != null;
        for (Rewards reward:list) {
            PrizeDTO prizeDTO = new PrizeDTO(reward.getId(), reward.getNome(), reward.getPuntiNecessari());
            prizeDTOS.add(prizeDTO);
        }
        return prizeDTOS;
    }

    @Override
    public int checkFP(String codiceFiscale) {
//        Da fare la chiamata
        return 1;
    }

    @Override
    public PrizeDTO redeemPrize(String codiceFiscale, int idPrize) {
//        Da fare la chiamata
        return null;
    }
}
