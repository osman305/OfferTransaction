package com.festiveoffers.offertransaction.service;

import com.festiveoffers.offertransaction.repository.OfferTransactionRepository;
import com.festiveoffers.offertransaction.request.OfferTransactionRequest;
import com.festiveoffers.offertransaction.response.OfferTransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OfferTransactionService {

    @Autowired
    private OfferTransactionRepository offerTransactionRepository;

    public OfferTransactionRequest saveOfferRequest(OfferTransactionRequest offerRequest) {
        //log level should be debug here
        log.debug("debug message Inside saveRequest method of OfferTransactionService");
        log.info("Inside saveRequest new method of OfferTransactionService");
        //convert offer transaction request to offer transaction model
        //offer transaction reposiory shoukd take offertransaction model instead of otrequest
        //it should return offer transaction model
        OfferTransactionRequest otr = offerTransactionRepository.save(offerRequest);
        //conver offer tansactionmodel to offertransactionresponse
        //should return offertransaction response
        return otr;
    }

    public OfferTransactionResponse convertRequestToResponse(OfferTransactionRequest offerRequest) {
        log.info("Inside convertRequestToResponse method of OfferTransactionService1");
        OfferTransactionResponse transactionResponse = new OfferTransactionResponse();
        transactionResponse.setMemberId(offerRequest.getMemberId());
        transactionResponse.setStoreNumber(offerRequest.getStoreNumber());
        transactionResponse.setTerminalNumber(offerRequest.getTerminalNumber());
        transactionResponse.setTransactionNumber(offerRequest.getTransactionNumber());
        return transactionResponse;
    }

    public List<OfferTransactionRequest> getOfferRequest() {
        log.info(" debug message Inside getOfferRequest method of OfferTransactionService2");

        List<OfferTransactionRequest> AppliedOffer =  offerTransactionRepository.findAll();
        return AppliedOffer;
    }

    public OfferTransactionRequest saveOfferRequest2(OfferTransactionRequest offerRequest) {
        log.debug("debug message Inside saveOfferRequest2 method of OfferTransactionService ");
        log.info("Inside saveOfferRequest2 method of OfferTransactionService");
        OfferTransactionRequest otr2 = offerTransactionRepository.save(offerRequest);
        return otr2;
    }
}
