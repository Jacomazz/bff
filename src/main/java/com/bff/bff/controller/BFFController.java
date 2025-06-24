package com.bff.bff.controller;


import com.bff.bff.BFFService.BFFServiceIMPL;
import com.bff.bff.models.BookDTO;
import com.bff.bff.models.OrderDTO;
import com.bff.bff.models.PrizeDTO;
import com.bff.bff.models.StatusEnumDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("amazon")
public class BFFController {

    @Autowired
    private BFFServiceIMPL service;

    @GetMapping("")
    public List<BookDTO> getBook() {
        return service.getBooks();
    }

    @PostMapping("")
    public OrderDTO placeOrder(@RequestBody int idLibro, int nCopie, String codiceFiscale, String indirizzo) {
        return service.placeOrder(idLibro, nCopie, codiceFiscale, indirizzo);
    }

    @GetMapping("/order/{codiceFiscale}/{id}")
    public StatusEnumDTO checkOrderState(@PathVariable String codiceFiscale, @PathVariable int id) {
        return service.checkOrderState(codiceFiscale, id);
    }

    @GetMapping("/prizes")
    public List<PrizeDTO> checkPrizes() {
        return service.checkPrizes();
    }

    @GetMapping("FDPoints")
    public int getFDPoints(@PathVariable String codiceFiscale) {
        return service.checkFP(codiceFiscale);
    }

    @GetMapping("/prize/{codiceFiscale}/{id}")
    public PrizeDTO redeemPrize(@PathVariable String codiceFiscale, @PathVariable int idPrize) {
        return service.redeemPrize(codiceFiscale, idPrize);
    }
}
