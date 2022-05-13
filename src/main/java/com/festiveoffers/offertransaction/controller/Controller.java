package com.festiveoffers.offertransaction.controller;

import com.festiveoffers.offertransaction.request.OfferTransactionRequest;
import com.festiveoffers.offertransaction.service.OfferTransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offer")
@Slf4j
public class Controller {

    @Autowired
    private OfferTransactionService ots;

    @PostMapping("/applyoffertransaction")
    public OfferTransactionRequest saveRequest(@RequestBody OfferTransactionRequest offerRequest) {
        log.info("Inside saveRequest method of Controller");
        return ots.saveOfferRequest(offerRequest);
    }
}