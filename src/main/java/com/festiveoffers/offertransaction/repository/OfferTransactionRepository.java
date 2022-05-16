package com.festiveoffers.offertransaction.repository;

import com.festiveoffers.offertransaction.request.OfferTransactionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferTransactionRepository extends JpaRepository<OfferTransactionRequest,String> {


    OfferTransactionRequest findAllById(String storeNumber);
}
