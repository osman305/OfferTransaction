package com.festiveoffers.offertransaction.controller;

import com.festiveoffers.offertransaction.request.OfferTransactionRequest;
import com.festiveoffers.offertransaction.service.OfferTransactionService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.logging.Logger;

@RestController
@RequestMapping("/offer")
@Slf4j
public class Controller {

    @Autowired
    private OfferTransactionService offerTransactionService;

    @PostMapping("/applyoffertransaction")
    public OfferTransactionRequest saveRequest(@RequestBody OfferTransactionRequest offerRequest) {
        log.debug("Inside saveRequest method of Controller1");
        return offerTransactionService.saveOfferRequest(offerRequest);

    }

    @PostMapping("/applyoffertransaction2")
    public OfferTransactionRequest applyRequest(@RequestBody OfferTransactionRequest offerRequest){
        log.info("Inside applyRequest method of Controller1");
        return offerTransactionService.saveOfferRequest2(offerRequest);
    }

    @GetMapping("/allAppliedOffers")
    public List<OfferTransactionRequest> getRequest(){
        log.debug(" debug message Inside getRequest method of Controller2");
        return offerTransactionService.getOfferRequest();
    }
}