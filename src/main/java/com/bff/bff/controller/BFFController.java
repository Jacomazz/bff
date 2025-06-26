package com.bff.bff.controller;

import com.bff.bff.BFFService.BFFServiceImpl;
import com.bff.bff.models.catalog.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/amazon")
public class BFFController {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private BFFServiceImpl serivce;

    @GetMapping("")
    public List<BookDTO> getBook() {
        return null;
    }

    @PostMapping("")
    public Object placeOrder(@RequestBody int idLibro, int nCopie, String codiceFiscale, String indirizzo) {
        return null;
    }

    @GetMapping("/order/{codiceFiscale}/{id}")
    public Object checkOrderState(@PathVariable String codiceFiscale, @PathVariable int id) {
        return null;
    }

    @GetMapping("/prizes")
    public Object checkPrizes() {
        return null;
    }

    @GetMapping("FDPoints")
    public Object getFDPoints(@PathVariable String codiceFiscale) {
        return null;
    }

    @GetMapping("/prize/{codiceFiscale}/{id}")
    public Object redeemPrize(@PathVariable String codiceFiscale, @PathVariable int idPrize) {
        return null;
    }
}
