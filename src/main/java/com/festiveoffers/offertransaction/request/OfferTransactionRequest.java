package com.festiveoffers.offertransaction.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@NotEmpty(message = "Store Number can't be empty or null")
@Table(name = "applied_Offer")
public class OfferTransactionRequest {

    @Id
    @NotEmpty(message = "Store Number can't be empty or null")
    private String storeNumber;
    private String memberId;
    private String terminalNumber;
    private String transactionNumber;
}
