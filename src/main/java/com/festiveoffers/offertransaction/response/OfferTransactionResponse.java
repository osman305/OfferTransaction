package com.festiveoffers.offertransaction.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferTransactionResponse {

    private String storeNumber;
    private String memberId;
    private String terminalNumber;
    private String transactionNumber;
}
