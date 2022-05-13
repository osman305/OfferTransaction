package com.festiveoffers.offertransaction.service;

import com.festiveoffers.offertransaction.repository.OfferTransactionRepository;
import com.festiveoffers.offertransaction.request.OfferTransactionRequest;
import com.festiveoffers.offertransaction.response.OfferTransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OfferTransactionService {

    @Autowired
    private OfferTransactionRepository offerTransactionRepository;

    public OfferTransactionRequest saveOfferRequest(OfferTransactionRequest offerRequest) {
        log.info("Inside saveRequest method of OfferTransactionService");
        OfferTransactionRequest otr = offerTransactionRepository.save(offerRequest);
        return otr;
    }

    public OfferTransactionResponse convertRequestToResponse(OfferTransactionRequest offerRequest) {
        log.info("Inside convertRequestToResponse method of OfferTransactionService");
        OfferTransactionResponse transactionResponse = new OfferTransactionResponse();
        transactionResponse.setMemberId(offerRequest.getMemberId());
        transactionResponse.setStoreNumber(offerRequest.getStoreNumber());
        transactionResponse.setTerminalNumber(offerRequest.getTerminalNumber());
        transactionResponse.setTransactionNumber(offerRequest.getTransactionNumber());
        return transactionResponse;
    }
}
