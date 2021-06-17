package com.pdfGenerator.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
@Setter
public class OrderRequest {

    private String cakeFlavour;
    private Integer weight;
    private String cakeShape;
    private Integer quantity;
    private String message;

    private LocalDate purchasedDate;
    private LocalTime purchaseTime;
    private LocalDate deliveryDate;

    private String receiverName;
    private String receiverContactNumber;
    private String receiverAddressLine1;
    private String receiverAddressLine2;
    private String receiverState;
    private String receiverCity;
    private String receiverPinCode;


}
