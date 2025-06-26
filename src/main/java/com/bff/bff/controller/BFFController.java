package com.bff.bff.controller;

import com.bff.bff.models.catalog.BookDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/amazon")
public class BFFController {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Autowired
//    private BFFServiceImpl serivce;

    @GetMapping("")
    public List<Object> getBook() {
        List<Object> bookList = (List<Object>) getRestTemplate().getForObject("localhost:8083/catalog",)
    }

    @PostMapping("")
    public Object placeOrder(@RequestBody BookDTO book) {
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
