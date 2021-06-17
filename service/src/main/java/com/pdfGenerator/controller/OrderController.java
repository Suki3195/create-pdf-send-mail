package com.pdfGenerator.controller;

import com.pdfGenerator.request.OrderRequest;
import com.pdfGenerator.response.SuccessResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrderController {

    @RequestMapping(path = "/placeOrder" , method = RequestMethod.POST)
    public SuccessResponse createOrder (OrderRequest orderRequest){


        return null;
    }
}
